boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
    if(yourLeft+yourRight == friendsLeft+friendsRight) {
        if(yourLeft== friendsLeft && yourRight== friendsRight || yourLeft== friendsRight && yourRight == friendsLeft){
            return true;
        } else return false;
        
    }
    else return false;
}
