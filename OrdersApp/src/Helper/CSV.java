package Helper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CSV {

    private Scanner sc;
    private List<String[]> productInfo;
    private List<Product> productList;

    public CSV(){
        sc = null;
        productInfo = new LinkedList<>();
        productList = new LinkedList<>();
    }

    public List<Product> getData()
    {
        try {
            sc = new Scanner(new FileReader(new File("C:\\Users\\A\\Desktop\\Test.csv")));
            sc.nextLine();
            while(sc.hasNext()){
                this.productInfo.add(sc.nextLine().split(","));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        for(String[] str: productInfo){
            Product p = new Product();
            String pName,pId,pPrice,pURL = "";
            for(int i =0; i < str.length;i++) {
                //p = new Product();
                Boolean flag = false;
                switch(i) {
                    case 0:
                        pName = str[i].isEmpty() ? " " : str[i];
                        p.setProductName(pName);
                        break;
                    case 1:
                        pId = str[i].isEmpty() ? " " : str[i];
                        p.setProductId(pId);
                        break;
                    case 2:
                       flag = str[i] == "yes" ? true:false;
                       p.setProductOutofStock(flag);
                       break;
                    case 3:
                        pPrice = str[i].isEmpty() ? " " :str[i];
                        p.setProductPrice(Double.parseDouble(pPrice));
                        break;
                    case 4:
                        pURL = str[i].isEmpty() ? " " : str[i];
                        p.setProductImageURL(pURL);
                        break;
                }
            }
           productList.add(p);
        }
        return productList;
    }
}
