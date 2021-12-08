#include <iostream>



char entrada[100]="ababbcbbaba";
int actual =0;

using namespace std;


void consumir (char c){
	if(c==entrada[actual]){
		actual++;
	}
	else{
		exit(-1);
	}
}

void P(void){
	switch (entrada[actual]){
		case 'a':				///regla 1
			consumir('a');
			P();
			consumir ('a');
		break;
		
		case 'b':				///regla 2
			consumir('b');
			P();
			consumir ('b');
		break;
		
		case 'c':				///regla 3
			consumir('c');
			P();
			consumir ('c');
		break;
		
		default :
		break;
	}
}


int main (void){
	
	P();
	return 0;
	
}
