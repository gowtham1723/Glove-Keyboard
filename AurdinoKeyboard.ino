const int Fin1 = A3;
const int Fin2 = A0;
const int Fin3 = A1;
const int Fin4 = A2;
const int Fins=A4;
const int Finc=A5;
int sensorValue = 0;
int sensorValue1 = 0;
int sensorValue2 = 0;
void setup() {
  Serial.begin(600);
}

char finger1(){
  sensorValue = analogRead(Fin1);
  sensorValue1 = analogRead(Finc);
  sensorValue2 = analogRead(Fins);
  sensorValue = 10*sensorValue;
  sensorValue1 = 10*sensorValue1;
  sensorValue2 = 10*sensorValue2;
  Serial.print("\t");
  Serial.print("\t");
  Serial.print("\t");
  if(sensorValue>=10000){
      if(sensorValue1>=10220){
    Serial.print("C");
    return 'C';}
  else if(sensorValue1>=10120){
    Serial.print("B");
    return 'B';}
  else if(sensorValue1>=9000){
    Serial.print("A");
    return 'A';}
  else if(sensorValue2>=10200){
    Serial.print("c");
    return 'c';}
  else if(sensorValue2>=10130){
    Serial.print("b");
    return 'b';}
  else if(sensorValue2>=10000){
    Serial.print("a");
    return 'a';}}
  else if(sensorValue>=5000){
      if(sensorValue1>=10220){
    Serial.print("F");
    return 'F';}
  else if(sensorValue1>=10120){
    Serial.print("E");
    return 'E';}
  else if(sensorValue1>=9000){
    Serial.print("D");
    return 'D';}
  else if(sensorValue2>=10200){
    Serial.print("f");
    return 'f';}
  else if(sensorValue2>=10130){
    Serial.print("e");
    return 'e';}
  else if(sensorValue2>=10000){
    Serial.print("d");
    return 'd';}}
     else if(sensorValue>=3000){
      if(sensorValue1>=10220){
    Serial.print("I");
    return 'I';}
  else if(sensorValue1>=10120){
    Serial.print("H");
    return 'H';}
  else if(sensorValue1>=9000){
    Serial.print("G");
    return 'G';}
  else if(sensorValue2>=10200){
    Serial.print("i");
    return 'i';}
  else if(sensorValue2>=10130){
    Serial.print("h");
    return 'h';}
  else if(sensorValue2>=10000){
    Serial.print("g");
    return 'g';}}
}
char finger3(){
  sensorValue = analogRead(Fin3);
  sensorValue1 = analogRead(Finc);
  sensorValue2 = analogRead(Fins);
  sensorValue = 10*sensorValue;
  sensorValue1 = 10*sensorValue1;
  sensorValue2 = 10*sensorValue2;
  Serial.print("\t");
  Serial.print("\t");
  Serial.print("\t");
  if(sensorValue>=10000){
      if(sensorValue1>=10220){
    Serial.print("L");
    return 'L';}
  else if(sensorValue1>=10120){
    Serial.print("K");
    return 'K';}
  else if(sensorValue1>=9000){
    Serial.print("J");
    return 'J';}
  else if(sensorValue2>=10200){
    Serial.print("l");
    return 'l';}
  else if(sensorValue2>=10130){
    Serial.print("k");
    return 'k';}
  else if(sensorValue2>=10000){
    Serial.print("j");
    return 'j';}}
  else if(sensorValue>=5000){
      if(sensorValue1>=10220){
    Serial.print("O");
    return 'O';}
  else if(sensorValue1>=10120){
    Serial.print("N");
    return 'N';}
  else if(sensorValue1>=9000){
    Serial.print("M");
    return 'M';}
  else if(sensorValue2>=10200){
    Serial.print("o");
    return 'o';}
  else if(sensorValue2>=10130){
    Serial.print("n");
    return 'n';}
  else if(sensorValue2>=10000){
    Serial.print("m");
    return 'm';}}
     else if(sensorValue>=3000){
      if(sensorValue1>=10220){
    Serial.print("R");
    return 'R';}
  else if(sensorValue1>=10120){
    Serial.print("Q");
    return 'Q';}
  else if(sensorValue1>=9000){
    Serial.print("P");
    return 'P';}
  else if(sensorValue2>=10200){
    Serial.print("r");
    return 'r';}
  else if(sensorValue2>=10130){
    Serial.print("q");
    return 'q';}
  else if(sensorValue2>=10000){
    Serial.print("p");
    return 'p';}}
}
char finger2(){
  sensorValue = analogRead(Fin2);
  sensorValue1 = analogRead(Finc);
  sensorValue2 = analogRead(Fins);
  sensorValue = 10*sensorValue;
  sensorValue1 = 10*sensorValue1;
  sensorValue2 = 10*sensorValue2;
  Serial.print("\t");
  Serial.print("\t");
  Serial.print("\t");
  if(sensorValue>=10000){
      if(sensorValue1>=10220){
    Serial.print("U");
    return 'U';}
  else if(sensorValue1>=10120){
    Serial.print("T");
    return 'T';}
  else if(sensorValue1>=9000){
    Serial.print("S");
    return 'S';}
  else if(sensorValue2>=10200){
    Serial.print("u");
    return 'u';}
  else if(sensorValue2>=10130){
    Serial.print("t");
    return 't';}
  else if(sensorValue2>=10000){
    Serial.print("s");
    return 's';}}
  else if(sensorValue>=5000){
      if(sensorValue1>=10220){
    Serial.print("X");
    return 'X';}
  else if(sensorValue1>=10120){
    Serial.print("W");
    return 'W';}
  else if(sensorValue1>=9000){
    Serial.print("V");
    return 'V';}
  else if(sensorValue2>=10200){
    Serial.print("x");
    return 'x';}
  else if(sensorValue2>=10130){
    Serial.print("w");
    return 'w';}
  else if(sensorValue2>=10000){
    Serial.print("v");
    return 'v';}}
     else if(sensorValue>=3000){
      if(sensorValue1>=10220){
    Serial.print("0");
    return '0';}
  else if(sensorValue1>=10120){
    Serial.print("Z");
    return 'Z';}
  else if(sensorValue1>=9000){
    Serial.print("Y");
    return 'Y';}
  else if(sensorValue2>=10200){
    Serial.print("0");
    return '0';}
  else if(sensorValue2>=10130){
    Serial.print("z");
    return 'z';}
  else if(sensorValue2>=10000){
    Serial.print("y");
    return 'y';}}
}
char finger4(){
  sensorValue = analogRead(Fin4);
  sensorValue1 = analogRead(Finc);
  sensorValue2 = analogRead(Fins);
  sensorValue = 10*sensorValue;
  sensorValue1 = 10*sensorValue1;
  sensorValue2 = 10*sensorValue2;
  //Serial.print(sensorValue);
  Serial.print("\t");
  //Serial.print(sensorValue1);
  Serial.print("\t");
  //Serial.print(sensorValue2);
  Serial.print("\t");
 
  
  
  if(sensorValue>=10220){
      if(sensorValue1>=10220){
    Serial.print("?");
    return '?';}
  else if(sensorValue1>=10120){
    Serial.print(",");
    return ',';}
  else if(sensorValue1>=9000){
    Serial.print(".");
    return '.';}
  else if(sensorValue2>=10200){
    Serial.print("3");
    return '3';}
  else if(sensorValue2>=10130){
    Serial.print("2");
    return '2';}
  else if(sensorValue2>=10000){
    Serial.print("1");
    return '1';}}
  else if(sensorValue>=10120){
      if(sensorValue1>=10220){
    Serial.print("(");
    return '(';}
  else if(sensorValue1>=10120){
    Serial.print('@');
    return '@';}
  else if(sensorValue1>=9000){
    Serial.print("!");
    return '!';}
  else if(sensorValue2>=10200){
    Serial.print("6");
    return '6';}
  else if(sensorValue2>=10130){
    Serial.print("5");
    return '5';}
  else if(sensorValue2>=10000){
    Serial.print("4");
    return '4';}}
     else if(sensorValue>=3000){
      if(sensorValue1>=10220){
    Serial.print("}");
    return '}';}
  else if(sensorValue1>=10120){
    Serial.print("{");
    return '{';}
  else if(sensorValue1>=9000){
    Serial.print(")");
    return ')';}
  else if(sensorValue2>=10200){
    Serial.print("9");
    return '9';}
  else if(sensorValue2>=10130){
    Serial.print("8");
    return '8';}
  else if(sensorValue2>=10000){
    Serial.print("7");
    return '7';}}
}

void loop() {  
  finger1();  
  finger2();  
  finger3();  
  finger4();
  delay(2); 
  Serial.println();
  
}
