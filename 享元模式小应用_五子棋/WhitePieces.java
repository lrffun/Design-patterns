package 享元模式小应用_五子棋;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class WhitePieces implements ChessPieces {
    public void DownPieces(Graphics g,Point pt)
    {       
        g.setColor(Color.WHITE);
        g.fillOval(pt.x,pt.y,30,30);
    }
}
