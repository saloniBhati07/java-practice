class E{
    private int id;
    private String name;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

}




public class Task3 {
    public static void main(String[] args){
        E em = new E();
        em.setId(101);
        em.setName("Saloni");
        System.out.println(em.getId()+" "+em.getName());

    }
}
