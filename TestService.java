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
	private TestRepository testRepository = TestRepository.getInstance();
	protected String loginNick = null;
	protected String loginPassword = null;


	public void save() {
		TestDTO testDTO = new TestDTO();
		while (true) {
			System.out.print("사용하실 닉네임을 입력하세요 >>> ");
			testDTO.setNick(sc.next());
			if (testRepository.dupCheck(testDTO.getNick())) {
				System.out.println("이미 사용중인 아이디입니다. 다시 입력해주세요");
			} else {
				break;
			}
		}
		System.out.print("사용하실 비밀번호를 입력하세요 >>> ");
		testDTO.setPassword(sc.next());
		if (testRepository.save(testDTO)) {
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
		if (testRepository.loginCheck(nick, password)) {
			System.out.println("\u001B[35m" + nick + "\u001B[30m" + " 님 환영합니다.");
			loginNick = nick;
			loginPassword = password;
			return true;
		} else {
			System.out.println("닉네임 또는 비밀번호를 확인하세요");
			return false;
		}

	}
	
	// 관리자용 기능이므로 지금은 필요 ㄴㄴ
	public void findAll() {
		Map<String, TestDTO> testMap = testRepository.findAll();
		System.out.println("ID\t\t닉네임\t\t내 포인트\t가입일자");
		System.out.println("──────────────────────────────────────────────────────────────────────────────────────────────────");
		List<String> keySet = new ArrayList<>(testMap.keySet()); 
		for (String key : keySet) {
			testMap.get(key).print();
		}
		System.out.println("──────────────────────────────────────────────────────────────────────────────────────────────────");
	}
	
	public void findById() {
		TestDTO testDTO = testRepository.findById(loginNick, loginPassword);
		
		if (testDTO == null) {
			System.out.println("로그인 오류");
		} else {
			System.out.println("ID\t\t닉네임\t\t내 포인트\t가입일자");
			System.out.println("──────────────────────────────────────────────────────────────────────────────────────────────────");
			System.out.println(testDTO.toString());
			System.out.println("──────────────────────────────────────────────────────────────────────────────────────────────────");

		}
	}

		


	
	
	public void logout() {
		loginNick = null;
		loginPassword = null;
		System.out.println("로그아웃되었습니다.");
	}
		

	}

