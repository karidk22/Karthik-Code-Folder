// Walker Demo
// Intro to keyboard input for movement
Walker Karthik; 

void setup() {
    size(1500, 700);
    Karthik = new Walker(width / 2, height / 2);
}

void draw() {
    background(255);
    Karthik.display();

}

void mousePressed() {
    
}

void keyPressed() {
    // For arrows, use property keyCode and UP, DOWN, ENTER, etc...
    // For ASCII char's, use 'key' and 'a', 'w', etc...

    if (keyCode == UP || key == 'w') {
        Karthik.move(0);
    }
    else if (keyCode == RIGHT || key == 'd') {
        Karthik.move(1);
    }
    else if (keyCode == DOWN || key == 's') {
        Karthik.move(2);
    }
    else if (keyCode == LEFT || key == 'a') {
        Karthik.move(3);
    }
}