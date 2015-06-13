package com.data.bigint;

/**
 * Created by sonamsinha on 2/8/15.
 */
public class BigInt {


    private int length = 0;
    private boolean isNegative= false;
    private boolean isResultNegative = false;
    private LinkedList link=null;
    private LinkedList newList = null;
    private BigInt fSum = null;
    private BigInt res = null;
    public String totalIntSum = "";

    public BigInt(String data) {

        link= new LinkedList();
        toConvert(data, link);

    }

    private void toConvert(String data, LinkedList link) {
        if(data.charAt(0)== '-'){
            isNegative= true;
        }
        String dataForComputing = data;
        dataForComputing = dataForComputing.replace("-", "");

        int sLength= dataForComputing.length();
        length = sLength;
        for(int i=0; i<=sLength-1; i++) {
            if(!(dataForComputing.charAt(i)>='a' && dataForComputing.charAt(i)<='z') || !(dataForComputing.charAt(i)>='A' && dataForComputing.charAt(i)<='Z') ) {

                char n = dataForComputing.charAt(i);
                int v = n - '0';
                link.add(v);
            }
        }
    }

    public boolean greaterThan(BigInt b)
    {
        /*Node m= this.link.head;
        Node m1= b.link.head;

        if()*/
        return false;
    }

    public BigInt sub(BigInt s)
    {

        int length1 = this.length;
        int length2 = s.length;
        int lastValuem1 = 0;
        int lastValuem = 0;
        boolean negResult = false;

        Node m= this.link.head;
        Node m1=s.link.head;
        if(length1 == length2){
            Node temp = m;
            if(m != null){
                while(temp.next != null){
                    temp = temp.next;
                }
                lastValuem = temp.info;
            }

            Node temp1 = m1;
            if(m1 != null){
                while(temp1.next != null){
                    temp1 = temp1.next;
                }
                lastValuem1 = temp1.info;
            }
            if(lastValuem1 > lastValuem){
                LinkedList templink = s.link;
                s.link = this.link;
                this.link = templink;
                if(!this.isNegative){
                    negResult = true;
                }
                if(this.isNegative && s.isNegative){
                    negResult = true;
                }
            }



        }

        m= this.link.head;
        m1=s.link.head;

        int borrow=0;
        newList = new LinkedList();
        while(m!=null || m1!=null){

            int result = 0;
            int temp=0;
            int dec = m.info - borrow;
            if(m.info < m1.info) {

                temp = dec + 10;
                result = temp - m1.info;
                borrow = 1;

            }
            else{
                 result = dec - m1.info;
                borrow = 0;
            }
            newList.add(result);
            m= m.next;
            m1= m1.next;

        }

        String finResult="";
        Node node = newList.head;
        while(node!=null){
            finResult= finResult + Integer.valueOf(node.info);
            node= node.next;
        }
        LinkedList templink = this.link;
        this.link = s.link;
        s.link = templink;

        res= new BigInt(finResult);
        if(negResult){
            res.isResultNegative = true;
        }

        return res;
    }

    /* remove leading zeros for readable displays */
    public void cleanUp()
    {
    }

    public BigInt add(BigInt s)
    {
        if((!this.isNegative && s.isNegative) || (this.isNegative && !s.isNegative)) {
            return this.sub(s);
        }


            int numberOfZerosFor2 = 0;
            int numberOfZerosFor1 = 0;


            int length1 = this.length;
            int length2 = s.length;

            if (length1 > length2) {
                numberOfZerosFor2 = length1 - length2;
            } else if (length2 > length1) {
                numberOfZerosFor1 = length2 - length1;
            }


            if (numberOfZerosFor2 > 0) {
                for (int k = 0; k < numberOfZerosFor2; k++) {
                    s.link.addLast(0);
                }
            } else if (numberOfZerosFor1 > 0) {
                for (int l = 0; l < numberOfZerosFor1; l++) {
                    this.link.addLast(0);
                }
            }


            Node m = this.link.head;
            Node m1 = s.link.head;

            int carry = 0;

            newList = new LinkedList();
            while (m != null || m1 != null) {
                int sum = 0;
                int temp = 0;

                sum = sum + m.info;
                sum = sum + m1.info;

                sum = sum + carry;

                if (sum >= 10) {
                    temp = sum - 10;
                    carry = sum / 10;
                } else {
                    temp = sum;
                }
                newList.add(temp);



                m = m.next;
                m1 = m1.next;
            }

            if(carry > 0){
                newList.add(carry);
            }

            String totalSum = "";
            Node node = newList.head;
            while (node != null) {
                totalSum = totalSum + Integer.valueOf(node.info);
                node = node.next;
            }
            fSum = new BigInt(totalSum);
            return fSum;


    }


    public String toString()
    {
        String r = "";

        Node node = link.head;
        while(node != null){
            r = Integer.valueOf(node.info)+r;// node.info+r
            node = node.next;
        }

        if(this.isResultNegative){
            r =  "- "+r;
        }

        if(this.isNegative){
            r = "- "+r;
        }

        //typically we say something like r = r + curNode.info
        // but the number is stored in reverse order, so we need
        //  something like r = curNode.info + r
        return r;
    }

    public int get(int pos){
        return link.get(pos);
    }

}
