package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result {
	private T data;
	
	public DataResult(T data, boolean success, String message) {
		super(success, message); //base sınıfın constructor'ını calistirir.
		this.data=data;
	}
	
	public DataResult(T data, boolean success) {
		super(success); //base sınıfın constructor'ını calistirir.
		this.data=data;
	}
	
	public T getData() {
		return this.data;
	}
	

}
