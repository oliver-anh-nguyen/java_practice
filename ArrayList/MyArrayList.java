
public final class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList array = new MyArrayList();
		System.out.println(array.toString());
		array.add("A");
		array.add("B");
		System.out.println(array.toString());
		array.add("C");
		System.out.println(array.toString());
		String removeValue = array.remove(1);
		System.out.println("Removed value: " + removeValue);
		System.out.println(array.toString());
		array.add("D");
		System.out.println(array.toString());
		array.remove(array.size - 1);
		System.out.println(array.toString());
	}

	private String[] arr = new String[8];

	public int size = 0;

	public void add(String value) {
		if (value == null) {
			return;
		}

		if (size >= arr.length) {
			resizeArray(1);
		}
		arr[size] = value;
		size++;
	}

	private void resizeArray(int length) {
		String[] tmpArray = new String[arr.length + length];
		for (int i=0; i<arr.length; i++) {
			tmpArray[i] = arr[i];
		}
		arr = tmpArray;
	}

	public String remove(int k) {
		if (k < 0 || k >= size) {
			return null;
		}
		String result = arr[k];

		while (k < size-1) {
			arr[k] = arr[k+1];
			k++;
		}
		arr[size-1] = null;
		size--;
		return result;
	}

	@Override
	public String toString() {
		String result = "[";
		for(int i=0; i<arr.length; i++) {
			String value = arr[i];
			if (value == null) {
				continue;
			}
			if (i != 0) {
				result += ",";
			}
			result += arr[i];
		}
		result += "]";
		return result;
	}
}
