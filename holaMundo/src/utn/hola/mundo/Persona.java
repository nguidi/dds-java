package utn.hola.mundo;

public class Persona {
	
	//	Declaracion de Variables
	private String name;
	private int age;
	
	//	Constructores de la clase
	
	//	Constructor vacio
	public Persona() {
		
	}
	//	Constructor donde se instancia el name
	public Persona(String newName) {
		//	Obliga el llamado al constructor vacio
		this();
		this.name = newName;
	}
	//	Constructor donde se instancia el name y age
	public Persona(String newName, int newAge) {
		//	Llamo al constructor donde instancia el name
		this(newName);
		this.age = newAge;
	}
	//	Getters y Setters generados automaticamente desde Source->Generate Getters and Setters...
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	//	Setters nuestros
	public String howOldAreYou() {
		return "Tengo "+this.age+" a�os.";
	}
	//	Redefino un getter. Por defecto toString aplicado a un objeto devuelve su nombre y id en memoria.
	//	Por ejemplo: utn.hola.mundo.Persona@as45qw45
	public String toString() {
		return "Hola mi nombre es "+this.name+". "+this.howOldAreYou();
	}
}
