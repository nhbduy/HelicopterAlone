package info.nguyenhoangbaoduy.helicopteralone;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/**
 * Created by DUYNGUYEN on 07/01/2016.
 */
public class TopBorder extends GameObject{
    private Bitmap image;

    public TopBorder(Bitmap res, int x, int y, int h) {
        height = h;
        width = 20;

        this.x = x;
        this.y = y;

        //dx = GamePanel.MOVESPEED;
        image = Bitmap.createBitmap(res, 0, 0, width, height);
    }

    public void update() {
        dx = -(Missile.overallMissileSpeed / 2);
        x += dx;
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(image, x, y, null);
    }

}
