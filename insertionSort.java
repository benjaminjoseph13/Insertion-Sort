public class insertionSort extends mainClass {

    public insertionSort(int[] number){}

            public void Ascending(){
            for(int a=1; a<number.length; a++){
                int tmp = number[a];
                int b = a;
                while((b>0) && (number[b-1] > tmp)){
                    number[b]=number[b-1];
                    b--;
                }
                number[b]=tmp;
            }

            System.out.print("ASCENDING:");
            for(int x = 0; x<10; x++){
                System.out.print(number[x]+ ", ");
            }
            }


           public void Descending(){
            for(int a=1; a<number.length; a++){
                int tmp = number[a];
                int b = a;
                while((b>0) && (number[b-1] < tmp)){
                    number[b]=number[b-1];
                    b--;
                }
                number[b]=tmp;
            }

            System.out.print("\nDESCENDING:");
            for(int x = 0; x<10; x++){
                System.out.print(number[x]+ ", ");
            }
}
}
