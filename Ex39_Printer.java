public class Ex39_Printer {

    private int tonerLevel;
    private int pagesPrinted ;
    private boolean duplex;

    public Ex39_Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel>-1 && tonerLevel<=100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }


    public int addToner(int tonerAmount){
//        int totalSum = 0;
//        if(tonerAmount > 0 && tonerAmount <= 100){
//            int tonerSum = tonerLevel + tonerAmount;
//            if(tonerSum > 100){
//                totalSum = -1;
//            }
//            tonerLevel += tonerAmount;
//            totalSum = tonerLevel;
//        }else {
//            totalSum = -1;
//        }
//        return totalSum;

        if (tonerAmount>0 && tonerAmount<=100) {
            return (tonerLevel + tonerAmount > 100) ? -1 : (tonerLevel += tonerAmount);
        }
        return -1;
        // return (tonerAmount>0 && tonerLevel + tonerAmount<=100) ? (tonerLevel += tonerAmount) : -1;


    }

    public int printPages(int pages){
//        int pagesToPrint = pages;
//
//        if(duplex == true){
//            System.out.println("Printing in duplex mode");
//            pagesToPrint /= 2;
//            pagesPrinted +=pagesToPrint;
//
//        }
//        return pagesToPrint;

        int pagesToPrint = (duplex) ? (Math.round((float) pages/2)) : pages;
        pagesPrinted += pagesToPrint; // add the pagesToPrint for this job to lifetime printer counter
        return pagesToPrint;

    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }

    public static void main(String[] args) {
        Ex39_Printer printer = new Ex39_Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }

}
