public class PracticeProblem {

	public static void main(String args[]) {
	}
	
	public static void selectionSortName(String[] names, int[] ages) {
		for(int i = 0; i < names.length - 1; i++) {
			int smallIndex = i;
			for(int j = i + 1; j < names.length; j++) {
				
				
				if(names[j].toLowerCase().compareTo(names[smallIndex].toLowerCase()) < 0) {
					smallIndex = j;
				}
			}
			
			String name = names[i];
			int age = ages[i];
			names[i] = names[smallIndex];
			ages[i] = ages[smallIndex];

			names[smallIndex] = name;
			ages[smallIndex] = age;
		}
	}

	public static void selectionSortAge(String[] names, int[] ages) {
		for(int i = 0; i < ages.length - 1; i++) {
			int smallIndex = i;
			for(int j = i + 1; j < ages.length; j++) {
				
				
				if(ages[j] < ages[smallIndex]) {
					smallIndex = j;
				}
			}
			
			String name = names[i];
			int age = ages[i];
			names[i] = names[smallIndex];
			ages[i] = ages[smallIndex];

			names[smallIndex] = name;
			ages[smallIndex] = age;
		}
	}
}