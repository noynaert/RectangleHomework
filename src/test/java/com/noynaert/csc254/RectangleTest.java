package com.noynaert.csc254;

import org.junit.Test;


import static org.junit.Assert.*;

public class RectangleTest {
    private final static double NEG = -1.0;
    private final static double ZERO = 0.0;
    private final static double DELTA = 0.00001;
    private final static double ONE = 1.0;
    private final static double BIG = 999.99;
    private final static double CLOSE = BIG + DELTA/2.0;
    private final static double BIGGER = BIG + DELTA;
    private final static double A = 2.5;
    private final static double B = 3.5;
    private final static double C = 5.0;
    private final static double D = 27.5;
    private final static double E = 88.3;
    private final static double F = 0.5;
    private final static double G = .12345;
    Rectangle a = new Rectangle();
    Rectangle b = new Rectangle(NEG);
    Rectangle c = new Rectangle(ZERO);
    Rectangle d = new Rectangle(ONE);
    Rectangle e = new Rectangle(BIG);
    Rectangle f = new Rectangle(CLOSE);
    Rectangle g = new Rectangle(BIGGER);
    Rectangle h = new Rectangle(A);
    Rectangle i = new Rectangle(B);
    Rectangle j = new Rectangle(C);
    Rectangle k = new Rectangle(D);
    Rectangle m = new Rectangle(E);
    Rectangle n = new Rectangle(A, B);
    Rectangle o = new Rectangle(B, A);
    Rectangle p = new Rectangle(C, C);
    Rectangle q = new Rectangle(D, E);
    Rectangle r = new Rectangle(E, D);
    Rectangle s = new Rectangle(ZERO,A);
    Rectangle t = new Rectangle(A, ZERO);
    Rectangle u = new Rectangle(NEG,BIG);
    Rectangle v = new Rectangle(BIG,NEG);
    Rectangle w = new Rectangle(NEG,NEG);
    Rectangle x = new Rectangle(F,G);
    Rectangle y = new Rectangle(F,G);


    @Test
    public void getLength() {
        assertEquals(1.0, a.getLength(), DELTA);
        assertEquals(1.0, b.getLength(), DELTA);
        assertEquals(1.0, c.getLength(), DELTA);
        assertEquals(1.0, d.getLength(), DELTA);
        assertEquals(BIG, e.getLength(), DELTA);
        assertEquals(CLOSE, f.getLength(), DELTA);
        assertEquals(BIGGER, g.getLength(), DELTA);
        assertEquals(A, h.getLength(), DELTA);
        assertEquals(B, i.getLength(), DELTA);
        assertEquals(C, j.getLength(), DELTA);
        assertEquals(D, k.getLength(), DELTA);
        //skipping l because it looks like a 1
        assertEquals(E, m.getLength(), DELTA);
        assertEquals(B, n.getLength(), DELTA);
        assertEquals(B, o.getLength(), DELTA);
        assertEquals(C, p.getLength(), DELTA);
        assertEquals(E, q.getLength(), DELTA);
        assertEquals(E, r.getLength(), DELTA);
        assertEquals(A, s.getLength(), DELTA);
        assertEquals(A, t.getLength(), DELTA);
        assertEquals(BIG, u.getLength(), DELTA);
        assertEquals(BIG, v.getLength(), DELTA);
        assertEquals(1.0, w.getLength(), DELTA);
        assertEquals(F, x.getLength(), DELTA);
        assertEquals(F, y.getLength(), DELTA);


    }

    @Test
    public void getWidth() {

    }

    @Test
    public void TesttoString() {
        assertEquals("1.0000 x 1.0000", a.toString());
    }

    @Test
    public void isSquare() {
        assertTrue(a.isSquare());
        assertFalse(n.isSquare());

    }


    @Test
    public void getArea() {
        assertEquals(1.0,a.getArea(),DELTA);

    }


    @Test
    public void getPerimeter() {
    }


}