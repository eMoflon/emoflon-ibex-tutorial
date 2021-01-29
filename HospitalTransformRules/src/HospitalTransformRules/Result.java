package HospitalTransformRules;

	public class Result {
		private boolean success;
		private String reason;

		public Result(boolean success, String reason) {
			this.success = success;
			this.reason = reason;
		}

		public boolean isSuccess() {
			return success;
		}

		public String getReason() {
			return reason;
		}
	}


