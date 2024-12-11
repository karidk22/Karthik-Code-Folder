grid g;

void setup() {
  size(1700,800);
  g = new grid(10, 10);
}

void draw() {
  background(220);
  g.displayGrid();
}

void mousePressed() {
 g.click(mouseX, mouseY); 
}

class grid {
  int ROWS, COLS;
  boolean[][] gridarray;
  
  //Constructor
  grid(int tempr, int tempc) {
    ROWS = tempr;
    COLS = tempc;
    gridarray = new boolean[ROWS][COLS];
    
    for (int y = 0; y < ROWS; y++) {
      for (int x = 0; x < COLS; x++) {
        gridarray[y][x] = false;
      }
    }
    
    gridarray[4][3] = true;
  }
  
  void displayGrid() {
    gridarray[4][3] = true;
    
    for (int y = 0; y < ROWS; y++) {
      for (int x = 0; x < COLS; x++) {
        if (gridarray[y][x] == false) {
          fill(255); // White fill false
        } else {
         fill (0); // Black fill true 
        }
        
        int cellWidth = width / COLS;
        int cellHeight = height / ROWS;
        
        //Starts drawing from top left corner of Rectangle
        rect(x * cellWidth, y * cellHeight, cellWidth, cellHeight);        
      }
    }
  }
  
  void click(int mx, int my) {
    int cellWidth = width / COLS;
    int cellHeight = height / ROWS;
    
    int x = mx / cellWidth;
    int y = my / cellHeight; 
    
    if (gridarray[y][x] == false) {
      gridarray[y][x] = true; // Make it true from false
    } else {
      gridarray[y][x] = false; // Make it false from true
    }
  }
}
