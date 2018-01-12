import java.util.ArrayList;
public class Data
	{
		private String instantiation;
		private String method;
		private String correctAnswer;
		
		public Data (String i, String m, String cA)
		{
			instantiation = i;
			method = m;
			correctAnswer = cA;
			
		}

		public String getInstantiation() {
			return instantiation;
		}

		public void setInstantiation(String instantiation) {
			this.instantiation = instantiation;
		}

		public String getMethod() {
			return method;
		}

		public void setMethod(String method) {
			this.method = method;
		}

		public String getCorrectAnswer() {
			return correctAnswer;
		}

		public void setCorrectAnswer(String correctAnswer) {
			this.correctAnswer = correctAnswer;
		}
	

	}
