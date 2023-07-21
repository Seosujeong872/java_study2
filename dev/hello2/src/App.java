import java.util.List;
import java.util.Scanner;

public class App {

     // 디비 연결


 
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       // 사용자에게 id,pw,이름,이메일 입력받기
       Scanner sc = new Scanner(System.in);
       System.out.print("ID 입력 : ");
       String id = sc.next();
       System.out.print("PW 입력 : ");
       String pw = sc.next();
       System.out.print("이름 입력 : ");
       String name = sc.next();
       System.out.print("이메일 입력 : ");
       String email = sc.next();
       sc.close();
       NaverDTO dto = new NaverDTO();
       dto.setUserId(id);
       dto.setUserPw(pw);
       dto.setName(name);
       dto.setEmail(email);
        // 디비 연결
        DBClass.connectDB();
        // 데이터 저장
        DBClass.saveDB(dto);
        // 데이터 조회
        List<NaverDTO> resultDto = DBClass.selectDB();
        for(NaverDTO item : resultDto){
            System.out.println("아이디 : " + item.getUserId());
            System.out.println("비밀번호 : " + item.getUserPw());
            System.out.println("이름 : " + item.getName());
            System.out.println("이메일 : " + item.getEmail());
            System.out.println();
        }



        // 데이터 수정
        // 데이터 삭제
    }
}
