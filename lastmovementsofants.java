// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int checkPos(List<Integer> pos){
        for(int i = 0; i < pos.size() - 1; i++){
            if(pos.get(i) + 1 == pos.get(i + 1)){
                return i;
            }
        }
        return -1;
    }
    
    public static void direction(List<Character> dir, List<Integer> pos, int n, List<Character> plank){
        int cp = checkPos(pos);
        if(cp != -1){
            if(dir.get(cp) == 'R'){
                dir.set(cp, 'L');
            }
            else{
                dir.set(cp, 'R');
            }
            
            if(dir.get(cp + 1) == 'R'){
                dir.set(cp + 1, 'L');
            }
            else{
                 dir.set(cp + 1, 'R');
            }
        }
        
        for(int i = 0; i < n; i++){
            if(dir.get(i) == 'R'){
                pos.set(i, pos.get(i) + 1);
            }
            else{
                pos.set(i, pos.get(i) - 1);
            }
            
        }
        
    }
    
    public static void printVis(int l, int n, List<Character> plank, List<Character> dir, List<Integer> pos){
        
            
        int t = 0;
        System.out.println("");
        while(plank.size() >= 0){
            for(int i = 0; i < pos.size(); i++){
                    if(pos.get(i) == 10){
                        plank.remove(pos.get(i));
                }
            }
            
            int p = 0;
            for(int i = 1; i <= l; i++){
                if(pos.get(p) == i){
                    System.out.print(plank.get(p));
                    // System.out.print("  ");
                    if(p < n - 1){
                        p++;
                    }
                    System.out.print("     ");
                    continue;
                }
                System.out.print("      ");
            }
            System.out.println(" "+t);
            direction(dir,pos, n, plank);
            
            t++;
        }
    }
    
    public static void main(String[] args) {
        int l = 10;
        int n = 3;
        List<Integer> pos = new ArrayList<>();
        pos.add(2);
        pos.add(4);
        pos.add(7);
        List<Character> dir = new ArrayList<>();
        dir.add('R');
        dir.add('R');
        dir.add('L');
        List<Character> plank = new ArrayList<>();
        
        char ch = 'a';
        for(int i = 0; i < n; i++){
            plank.add(ch);
            ch++;
        } 
        
        for(int i = 1; i <= l; i++){
            System.out.print(i);
            if(i < l){
                System.out.print("-----");
            }
        }
        System.out.print("     t");
        printVis(l,n,plank,dir,pos);
        // System.out.print(plank);
    }
}