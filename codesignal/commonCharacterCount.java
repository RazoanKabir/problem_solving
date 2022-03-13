int solution(String s1, String s2) {
    int counter = 0;

    List<Character> list = new LinkedList<>();
    for (char aChar : s1.toCharArray()) {
        list.add(aChar);
    }

    for (char c : s2.toCharArray()) {
        if (list.contains(c)) {
            list.remove(Character.valueOf(c));
            counter++;
        }
    }
    return counter;
}
