package USER.STAFF;

/**
 *
 * @author Shub
 */
import java.io.IOException;
import java.util.Scanner;

class Pnt
{
    int x, y;

    public Pnt( int _x, int _y )
    {
        x = _x;
        y = _y;
    }
}

public class Spiral
{

    static int interior( Pnt p ) // returns points within interior square of side length MAX( x, y ) - 1
    {
        int a = Math.max( Math.abs( p.x ), Math.abs( p.y ));
        return ( 2*a - 1 )*( 2*a - 1 );
    }


    static Pnt startPnt( Pnt p ) // first point in that spiral
    {
        int a = Math.max( Math.abs( p.x ), Math.abs( p.y ));

        // last pnt in prev spiral = [ a-1, -( a-1 ) ]

        // next pnt  = [ a, -( a-1 ) ]

        return new Pnt( a, -( a-1 ));
    }

    static int offSetRow1( Pnt pStart, Pnt p )
    {

        return ( p.y - pStart.y ) + 1;
    }



    static int solve( Pnt curr )
    {
        // check location of curr
        // It may lie on 1st row, 2nd row, 3rd or 4th row

        int a = Math.max( Math.abs( curr.x ), Math.abs( curr.y ));
        int off=0;
        int interiorCnt = interior( curr );
        Pnt start = startPnt( curr );

        if( ( curr.x == a ) && ( curr.y >= start.y ) ) // row 1
        {
            off = offSetRow1( start, curr );
            return off+interiorCnt;
        }

         if( curr.y == a ) // row 2
        {
            Pnt start2 = new Pnt( a, a );
            int off1 = offSetRow1( start, start2 );

            // now add diff in x-coordinates

            int off2 = start2.x - curr.x;
            off = off1 + off2;
            return off+interiorCnt;

        }

        if( curr.x == -a ) // row 3
        {
            Pnt start2 = new Pnt( a, a );
            int off1 = offSetRow1( start, start2 );

            // now add diff in x-coordinates

            Pnt start3 = new Pnt( -a, a );
            int off2 = start2.x - start3.x;

            // now add diff in y co-ordinates


            int off3 = start3.y - curr.y;

            off = off1 + off2 + off3;
            return off+interiorCnt;

        }

        else // row 4
        {
             Pnt start2 = new Pnt( a, a );
            int off1 = offSetRow1( start, start2 );

            // now add diff in x-coordinates

            Pnt start3 = new Pnt( -a, a );
            int off2 = start2.x - start3.x;

            // now add diff in y co-ordinates


            int off3 = start3.y - curr.y;

            Pnt start4 = new Pnt( -a, -a );

            // add diff in x co-ordinates

            int off4 = curr.x - start4.x;
            off = off1 + off2 + off3 + off4;
            return interiorCnt + off;
        }


    }

    public static void main( String[] args ) throws IOException
    {
        Scanner s = new Scanner( System.in );

        while( true )
        {
            int x = s.nextInt();
            int y = s.nextInt();

            Pnt curr = new Pnt( x, y );
            System.out.println( solve( curr ));
        }
    }

}