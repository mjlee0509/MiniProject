package miniProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import day17.ClientRepository;
import day17.ClientService;

public class TestService {

	private static TestService service = new TestService();

	private TestService() {
	}

	public static TestService getInstance() {
		// TODO Auto-generated method stub
		return service;
	}

	private Scanner sc = new Scanner(System.in);
	private TestRepository repository = TestRepository.getInstance();
	private String loginNick = null;
	private String loginPassword = null;


	public void save() {
		TestDTO testDTO = new TestDTO();
		while (true) {
			System.out.print("사용하실 닉네임을 입력하세요 >>> ");
			testDTO.setNick(sc.next());
			if (repository.dupCheck(testDTO.getNick())) {
				System.out.println("이미 사용중인 아이디입니다. 다시 입력해주세요");
			} else {
				break;
			}
		}
		System.out.print("사용하실 비밀번호를 입력하세요 >>> ");
		testDTO.setPassword(sc.next());
		if (repository.save(testDTO)) {
			System.out.println("\u001B[35m" + testDTO.getNick() + "\u001B[30m" + " 님 환영합니다");
		} else {
			System.out.println("회원가입 실패");
		}

	}
	
	public boolean loginCheck() { 
		TestDTO testDTO = new TestDTO();
		System.out.print("닉네임 >>> ");
		String nick = sc.next();
		System.out.print("비밀번호 >>> ");
		String password = sc.next();
		if (repository.loginCheck(nick, password)) {
			System.out.println("\u001B[35m" + nick + "\u001B[30m" + " 님 환영합니다.");
			loginNick = nick;
			loginPassword = password;
			return true;
		} else {
			System.out.println("ID 또는 비밀번호를 확인하세요");
			return false;
		}

	}
	
	public void findAll() {
		Map<String, TestDTO> testMap = repository.findAll();
		System.out.println("\n");
		System.out.println("아이디\t\t닉네임\t\t테스트결과\t\t\t\t테스트날짜");
		System.out.println("───────────────────────────────────────────────────────────────────────────");
		List<String> keySet = new ArrayList<>(testMap.keySet());
		for (String key : keySet) {
			testMap.get(key).print();
		}
		System.out.println("───────────────────────────────────────────────────────────────────────────");


	}
	
	

	


		

	
	public void logout() {
		loginNick = null;
		loginPassword = null;
		System.out.println("로그아웃되었습니다.");
	}
		

	}

