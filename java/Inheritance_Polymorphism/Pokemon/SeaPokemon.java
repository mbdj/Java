package Inheritance_Polymorphism.Pokemon;

public class SeaPokemon extends Pokemon
{
  private int nb_fins;

  public SeaPokemon(String name, double weight, int nb_fins)
  {
    super(name, weight);
    this.nb_fins = nb_fins;
  }

  public int getNbFins() { return nb_fins; }
  public void setNbFins(int nb_fins) { this.nb_fins = nb_fins; }
}