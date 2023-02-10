/*
Разработать программу, имитирующую поведение коллекции HashSet.
В программе содать метод add добавляющий элемент,
метод toString возвращающий строку с элементами множества
и метод позволяющий читать элементы по индексу.
Формат данных Integer.
*/


import java.util.HashMap;
public class HomeWork6 {

// static HashMap<Integer,Object> map = new HashMap<>();
// static final Object OBJ = new Object();
    public static void main(String[] args) {
        MySet mySet = new MySet();
        mySet.add(2);
        mySet.add(6);
        mySet.add(37);
        System.out.println(mySet);

        for (int e = 0; e < mySet.size(); e++){
            System.out.println(mySet.get(e));
        }

    }
}

class MySet {
    private HashMap<Integer, Object> map = new HashMap<>();
    private final Object OBJ = new Object();


    @Override
    public String toString(){
        return map.keySet().toString();
    }
    public boolean add(Integer i) {
        return map.put(i, OBJ) != null ? true : false;
    }
    public Integer size() {
        return map.keySet().size();
    }
    public Integer get(Integer a){
        return (Integer) map.keySet().toArray()[a];

    }
}