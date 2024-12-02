class Walker {
    int x, y; // Position Variables 
    int size;
    int speed;

    // Constructer
    Walker(int tempx, int tempy) {
        x = tempx;
        y = tempy;
        size = 25;
        speed = 25;
    }

    void display() {
        fill(0);
        // rect(xpos, ypos, width, height)
        rect(x, y, size, size);

    }

    // dir 0 = up, dir 1 = right, dir 2 = down, dir 3 = left
    void move(int dir) {
        // Move up
        if (dir == 0) { 
            y = y - speed;
        }
        // Move right
        else if (dir == 1) {
            x = x + speed;
        }
        // Move down
        else if (dir == 2) {
            y = y + speed;
        }
        // Move left
        else if (dir == 3) {
            x = x - speed;
            
        }
    }

}