package com.data.bigint;

/**
 * Created by sonamsinha on 2/9/15.
 */
public class TestBigInt {
  public static void main(String args[]) {


      BigInt b = new BigInt("-1");
      BigInt c = new BigInt("2");

      BigInt d = b.add(c);
      display(b,c,d, true);

      b = new BigInt("-12");
      c = new BigInt("20");

      d = b.add(c);
      display(b,c,d, true);

      b = new BigInt("999");
      c = new BigInt("999");

      d = b.add(c);
      display(b,c,d, true);

      b = new BigInt("111");
      c = new BigInt("11");

      d = b.add(c);
      display(b,c,d, true);

      b = new BigInt("111");
      c = new BigInt("1111");

      d = b.add(c);
      display(b,c,d, true);

      BigInt b1 = new BigInt("32");
      BigInt c1 = new BigInt("99");

      BigInt d1 = b1.sub(c1);
      display(b1,c1,d1, false);

      b1 = new BigInt("89");
      c1 = new BigInt("55");

      d1 = b1.sub(c1);
      display(b1,c1,d1, false);



  }

    public static void display(BigInt a, BigInt b, BigInt c, boolean add)
    {
        System.out.println();

        int aSize = a.toString().length();//aSize = a.size();
        int bSize = b.toString().length();//b.size();
        int cSize = c.toString().length();//c.size();

        int aAdd = 0, bAdd = 0, cAdd = 0, dashLength = 0;
        if( aSize >= bSize && aSize >= cSize )
        {
            dashLength = aSize;
            aAdd = 0;
            bAdd = aSize - bSize;
            cAdd = aSize - cSize;
        }
        if( bSize >= aSize && bSize >= cSize )
        {
            dashLength = bSize;
            bAdd = 0;
            aAdd = bSize - aSize;
            cAdd = bSize - cSize;
        }
        if( cSize >= bSize && cSize >= aSize )
        {
            dashLength = cSize;
            cAdd = 0;
            bAdd = cSize - bSize;
            aAdd = cSize - aSize;
        }

        for( int i=0; i<aAdd; i++ )
            System.out.print(" ");
        System.out.println( "  " + a );
        for( int i=0; i<bAdd; i++ )
            System.out.print(" ");

        if( add )
            System.out.println( "+ " + b );
        else
            System.out.println( "- " + b );

        System.out.print("  ");
        for( int i=0; i<dashLength; i++ )
            System.out.print( "-" );
        System.out.println( );

        for( int i=0; i<cAdd; i++ )
            System.out.print(" ");
        System.out.println( "  " + c );

    }
}
