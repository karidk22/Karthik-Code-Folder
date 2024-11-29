Ball[] ballGroup; 
int pos = 0;

Ball redball, ball2;

// Happens once at launch
void setup() {
    size(1280, 720);
    background(200, 200, 200);
    ballGroup = new Ball[100];
}

// Happens constantly (screen refresh)
void draw() {
    background(200, 200, 200);
    for (int i = 0; i < pos; i++) {
        ballGroup[i].display();
        ballGroup[i].move();
    }

}

void mousePressed() {
    if (pos < ballGroup.length) { 
    ballGroup[pos] = new Ball(mouseX, mouseY, 50);
    pos++; // Next empty position
    }
}

class Ball {
    int x, y, r;
    int dx, dy; // Speed or velocity
    int cr, cg, cb; // RGB Values
    int grav; // Gravity

    // Constructor
    Ball(int tempx, int tempy, int tempr) {
        x = tempx; // Set the x coord
        y = tempy; // Set the y coord
        r = tempr; // Set the radius

        // Set the velocity & gravity
        dx = int ( random (-10, 10));
        dy = int ( random (-10, 10));
        grav = -1;


        // Set the colour value
        cr = int (random(0, 255));
        cg = int (random(0, 255));
        cb = int (random(0, 255));

    }

    void display() {
        fill(cr, cg, cb);
        circle(x, y, r*2);
    }

    void move() {
        y = y + dy;
        x = x + dx;
        dy = dy - grav;

        if (y >= height - r || y <= 0 + r ) {
            dy = dy * -1;
        }

        if (x >= width - r || x <= 0 + r ) {
            dx = dx * -1;
        }
    }
}
