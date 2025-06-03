

for (int i = 0; i <= lista.length - 1; i++){
	for (int x = 0; x < lista.length - 1; i++){
		if(lista[x] > lista[x+1]){
			int aux;
			aux = lista[x];
			lista[x] = lista[x+1];
			lista[x+1] = aux;
}
}
}


int aux;
for (int i = 0; i <= lista.length - 1; i++){
	int menor = i;
	for (int x = menor; x < lista.length - 1; i++){
			if(lista[x] < lista[x+1]){ 
		aux = lista[i];
}
}