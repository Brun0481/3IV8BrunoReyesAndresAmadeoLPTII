Algoritmo Numero_Primo
	//2 es numero primo//
	num<-0
	Repetir
	Escribir "Ingrese un numero"
	Leer num
	Si num % 2 = 0 Entonces
		Escribir "No es primo"
	SiNo
		Escribir "Es primo"
	Fin Si
	Escribir "Repetir si o no"
	Leer resp
Hasta Que resp = "no"
FinAlgoritmo
