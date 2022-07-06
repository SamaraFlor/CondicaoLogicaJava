
public class UsandoIF {
      
	public static void main(String[] args) {
		ifErrado();
		ifCerto();
		ferias();
		diasSemana();
		numero();
		switchFerias();
	}

	//modo errado de se fazer If
	public static void ifErrado() {
		int mes = 8;
		if (mes == 1) {
			System.out.println("JANEIRO");
		} else {
			if (mes == 2) {
				System.out.println("FEVEREIRO");
			} else {
				if (mes == 3) {
					System.out.println("MARÇO");

				} else {
					if (mes == 4) {
						System.out.println("ABRIL");

					} else {
						if (mes == 5) {
							System.out.println("MAIO");
						} else {
							if (mes == 6) {
								System.out.println("JUNHO");
							} else {
								if (mes == 7) {
									System.out.println("JULHO");
								} else {
									if (mes == 8) {
										System.out.println("AGOSTO");
									} else {

									}

								}
							}
						}
					}
				}

			}

		}

	}



// if aceitavel para condição 
    public static void ifCerto() {
    	int mes = 8;
    	if (mes == 1) {
			System.out.println("janeiro");
		}else if (mes == 2){
			System.out.println("fevereiro");
		}else if(mes == 3) {
			System.out.println("março");
		}else if(mes == 4) {
			System.out.println("abril");
		}else if (mes == 5) {
			System.out.println("maio");
		}else if (mes == 6) {
			System.out.println("junho");
		}else if (mes == 7) {
			System.out.println("julho");
		}else if (mes == 8) {
			System.out.println("agosto");
		}else {
			System.out.println("mes invalido");
		}
    	
		}
		
	
			 // errado pois não tras as variaveis possiveis
		private static void ferias() {
			String mes = "julho";
		
			if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
				System.out.println("ferias");
				
			}
			
		}
		
				 
	//Criando variaveis para aumentar visibilidade do codio
	public static void ifMenor(){
		Double salarioMensal=1200.00;
		Double mediaSalario=12000.00;
		
		int quantidadesDependentes = 4;
		int mediaDependentes = 2;
		
		if ((salarioMensal < mediaSalario) && (quantidadesDependentes>= mediaDependentes)){
			System.out.println("Recebe auxilio");
		}
		
		boolean salarioBaixo = salarioMensal < mediaSalario;

		boolean muitosDependentes = quantidadesDependentes>= mediaDependentes;
		
		if ((salarioBaixo)&&(muitosDependentes)) {
			System.out.println("Recebe auxilio");
		}
		
	   boolean recebeAuxilio = ((salarioBaixo)&& (muitosDependentes));
	   if (recebeAuxilio) {
		   System.out.println("Recebe auxilio");
	}else {
		 System.out.println("Não Recebe auxilio");
	}
	}
	

	
      public static void diasSemana() {
    	  String dia = "terça";
    	  
    	  switch (dia) {
		case "segunda":
			System.out.println("1");
			break;
		case "terça":
			System.out.println("2");
			break;
		case "quarta":
			System.out.println("3");
			break;
		case "quinta":
			System.out.println("4");
			break;
		case "sexta":
			System.out.println("5");
			break;
		case "sabado":
			System.out.println("6");
			break;
		case "domingo":
			System.out.println("7");
			break;
		default:
			System.out.println("8");
			break;
    	
    	  }
    	  
      }
      // sem interromper sempre
      public static void numero() {
    		  
    	  int numero=  4;
    	  switch (numero) {
		case 1:
		case 2:
		case 3:
			System.out.println("certo");
			break;
		case 4:
			System.out.println("errado");
			break;
		case 5:
			System.out.println("talvez");
			break;
		default:
			System.out.println("valor invalido");
			break;
		}
      }
      
      
        public static void switchFerias() {
        	String mes = "dezembro";
        	 
        	switch (mes) {
			case "dezembro":
			case "janeiro":
			case "julho":
				System.out.println("Ferias");
				break;
			default:
				System.out.println("trabalharrr");
				break;
			}
        }
      }
    	  
    	  
      
		
		
		
	
	

