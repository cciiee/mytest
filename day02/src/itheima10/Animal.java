package itheima10;

public abstract class Animal {
    private String name;
	public Animal(){
		super();
	}
	public Animal(String name){
		super();
		this.name=name;
	}
public abstract void eat();
public abstract void sleep();
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

 
}