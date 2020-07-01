package Conteudo

//abstract -> indica que não poderá ser instanciada, causando erro pelo compilador
//open -> indica que será sobreescrita pela subclasse
//override -> a subclasse está sobreescrevendo da superclasse

//Interface uma superclasse que pode ser usada como referência para várias subclasses com finalidades distintas
interface Roamable
{ fun roam() }

class Vehicle : Roamable
{
    override fun roam ()
    {   println ("\tThe Conteudo.Vehicle is roaming")
    }
}

abstract class Animal : Roamable
{
    //Atributos abstratos não podem receber dados
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    //Métodos abstratos não podem receber instruções
    abstract fun makeNoise ()
    abstract fun eat ()

    override fun roam ()
    {   println ("\tThe Conteudo.Animal is roaming") }

    open fun sleep ()
    {   println ("The Conteudo.Animal is sleeping") }
}

class Hippo : Animal()
{   override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise ()
    {   println ("\t\tGrunt! Grunt!") }

    override fun eat ()
    {   println ("\t\t\t\tThe Conteudo.Hippo is eating $food") }
}

abstract class Canine : Animal()
{   override fun roam ()
    {   println("\tThe Conteudo.Canine is roaming") }
}

class Wolf : Canine()
{   override var image = "wolf.jpg"
    override var food = "meat"
    override var habitat = "forests"

    override fun makeNoise ()
    {   println ("\t\tHooooooowl!") }

    override fun eat ()
    {   println ("\t\t\t\tThe Conteudo.Wolf is eating $food") }
}

class Vet
{   fun giveShot (animal: Animal)
    {   animal.makeNoise() }
}

fun main (args: Array<String>)
{   println("\n")
    val animals = arrayOf (Hippo(), Wolf())

    for (item in animals)
    {   item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()

    println ("\n\tCalling the vet...")
    vet.giveShot(wolf)
    vet.giveShot(hippo)

    println()
    val animal: Animal = Wolf()
    if (animal is Wolf)
        animal.eat()

    println()
    val roamable = arrayOf(
        Hippo(),
        Wolf(),
        Vehicle()
    )
    for (itens in roamable)
    {   itens.roam()
        if (itens is Animal)
            itens.eat()
    }

    val str = if (animal is Wolf) "Conteudo.Wolf" else "Not Conteudo.Wolf"

    if (roamable is Animal && roamable.hunger<5)
        println ("OK 1")

    if (roamable !is Animal || roamable.hunger>=5)
        println ("OK 2")

//  while (animal is Conteudo.Wolf)  ...

/*  when (roamable)
    {   is Conteudo.Wolf -> println ("\n\n\t\tIt's a wolf")
        is Conteudo.Hippo -> println ("\n\n\t\tIt's a hippo")
    }
*/
}