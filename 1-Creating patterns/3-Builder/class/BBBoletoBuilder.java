public class BBBoletoBuilder implements BoletoBuilder {
2 private String sacado ;
3 private String cedente ;
4 private double valor ;
5 private Calendar vencimento ;
6 private int nossoNumero ;
7
8 public void buildSacado ( String sacado ) {
9 this . sacado = sacado ;
10 }
11
12 public void buildCedente ( String cedente ) {
13 this . cedente = cedente ;
14 }
15
16 public void buildValor ( double valor ) {
17 this . valor = valor ;
18 }
19
20 public void buildVencimento ( Calendar vencimento ) {
21 this . vencimento = vencimento ;
22 }
23
24 public void buildNossoNumero ( int nossoNumero ) {
25 this . nossoNumero = nossoNumero ;
26 }
27
28 public Boleto getBoleto () {
29 return new BBBoleto ( sacado , cedente , valor , vencimento , nossoNumero ) ;
30 }
31 }