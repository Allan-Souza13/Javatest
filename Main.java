class Main {
  public static void main(String[] args) {
   
int[] saldo = {350, 478, 555};
System.out.println("O SALDO DA SUA CONTA É: ");
for(int i=0; i<saldo.length; i++)
System.out.println(saldo[i]);
//-------------------------------------------------//

int[] idade = new int[5];

idade[0] = 20;
idade[1] = 40;
idade[2] = 80;


System.out.println("Primeira idade: " + idade[0] + " de idade.");

System.out.println("Segunda idade: " + idade[1] + " de idade.");

System.out.println("Terceira idade: " +idade[2]+ " de idade.");

//----------------------------------------------------//

int soma = 0;

for(int x: idade)
    soma = soma + x;

System.out.println("Soma das idades: " + soma);


//---------------------------------------------------//
int[] numeros = {1, 2, 3, 4, 5, 6};
int[] copia = numeros;

numeros [0] =99;

for(int x:copia)
System.out.println(x+", ");

  }
}