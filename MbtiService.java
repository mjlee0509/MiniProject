package miniProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MbtiService {

	private static MbtiService mbtiService = new MbtiService();

	private MbtiService() {
	}

	public static MbtiService getInstance() {
		// TODO Auto-generated method stub
		return mbtiService;
	}

	private Scanner sc = new Scanner(System.in);
	Util util = new Util();
	private MbtiRepository mbtiRepository = MbtiRepository.getInstance();
	private TestRepository testRepository = TestRepository.getInstance();
//	MbtiDTO mbtiDTO = new MbtiDTO();
		
	List<MbtiDTO> resultList = new ArrayList<>();

	public void mbtiSave() {
		MbtiDTO mbtiDTO = new MbtiDTO();
		while (true) {
			System.out.println("\n");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("Q1) 수강 첫 날 ... ");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("0. \'잘 할 수 있을까...?\' 오만가지 걱정이 앞선다. ");
			System.out.println("1. 새로운 친구를 사귈 생각에 설렌다.");
			System.out.print("응답 >>> ");
			mbtiDTO.setQuestion01(util.numberCheck());
			if (mbtiDTO.getQuestion01() < 2) {
				System.out.println("\n");
				break;
			} else {
				System.out.println("\u001B[31m" + "0 또는 1로 응답하세요\n" + "\u001B[30m");
			}
		}

		while (true) {
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("Q2) 첫 수업시간, 옆에 앉은 동기가 벌써부터 헤매고 있다.");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("0. \'이건 이렇게 하는거에요\' 마음속으로는 도와주고 싶지만 선뜻 나서지 못한다.");
			System.out.println("1. \"이건 이렇게 하는거에요\" 먼저 발벗고 나서서 알려준다");
			System.out.print("응답 >>> ");
			mbtiDTO.setQuestion02(util.numberCheck());
			if (mbtiDTO.getQuestion02() < 2) {
				System.out.println("\n");
				break;
			} else {
				System.out.println("\u001B[31m" + "0 또는 1로 응답하세요\n" + "\u001B[30m");
			}

		}

		while (true) {
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("Q3) 첫 수업이 끝나고 잠깐 바람 쐬러 나갔는데, 같은 수업을 듣는 동기를 마주쳤다.");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("0. 혼자 있고 싶다. 못 본 척하며 지나간다.");
			System.out.println("1. \"어?! 과정평가형 백엔드 들으시죠?\" 적극적으로 다가가 말을 건다");
			System.out.print("응답 >>> ");
			mbtiDTO.setQuestion03(util.numberCheck());
			if (mbtiDTO.getQuestion03() < 2) {
				System.out.println("\n");
				break;
			} else {
				System.out.println("\u001B[31m" + "0 또는 1로 응답하세요\n" + "\u001B[30m");
			}

		}
		 mbtiDTO.getEiScore();
		 mbtiDTO.setEiResult();
	

		while (true) {
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("Q4) 둘째날, 갑자기 수업 내용이 어려워졌다. 수업 내용이 도무지 이해가 안 된다.");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("0. 이해가 안 되면 그냥 외운다.");
			System.out.println("1. 이해가 안 되면 어떻게든 머리를 굴려서 이해하려고 한다.");
			System.out.print("응답 >>> ");
			mbtiDTO.setQuestion04(util.numberCheck());
			if (mbtiDTO.getQuestion04() < 2) {
				System.out.println("\n");
				break;
			} else {
				System.out.println("\u001B[31m" + "0 또는 1로 응답하세요\n" + "\u001B[30m");
			}
		}

		while (true) {
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("Q5) 옆에 앉은 분도 아직 이해를 못 한 모양이다. 나에게 어떻게 한 건지 물어보는데... ");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("0. 어디서 어떤 코드가 어떻게 동작하는지 세밀하게 알려준다");
			System.out.println("1. 개념 위주로 두루뭉슬하게 알려준다.");
			System.out.print("응답 >>> ");
			mbtiDTO.setQuestion05(util.numberCheck());
			if (mbtiDTO.getQuestion05() < 2) {
				System.out.println("\n");
				break;
			} else {
				System.out.println("\u001B[31m" + "0 또는 1로 응답하세요\n" + "\u001B[30m");
			}
		}

		while (true) {
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("Q6) 수업이 끝나고 집에 가는 길에 나는 ... ");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("0. \'집에 가서 밥 먹고 씻고 공부하다 자야지\' 별 생각 없이 가다보니 어느새 집 앞이다.");
			System.out.println("1. \'자고 일어났더니 천재 개발자가 된 나ㅋㅋ\' 별의 별 생각을 다 하며 가다보니 어느새 집 앞이다.");
			System.out.print("응답 >>> ");
			mbtiDTO.setQuestion06(util.numberCheck());
			if (mbtiDTO.getQuestion06() < 2) {
				System.out.println("\n");
				break;
			} else {
				System.out.println("\u001B[31m" + "0 또는 1로 응답하세요\n" + "\u001B[30m");
			}
		}
		mbtiDTO.getNsScore();
		mbtiDTO.setNsResult();

	
		while (true) {
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("Q7) 오늘부터 배웠던 내용들을 정리해서 블로그에 올리려고 한다.");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("0. 오늘 배웠던 내용들을 사실 위주로 쓴다.");
			System.out.println("1. 오늘 배우면서 느꼈던 느낌 위주로 쓴다.");
			System.out.print("응답 >>> ");
			mbtiDTO.setQuestion07(util.numberCheck());
			if (mbtiDTO.getQuestion07() < 2) {
				System.out.println("\n");
				break;
			} else {
				System.out.println("\u001B[31m" + "0 또는 1로 응답하세요\n" + "\u001B[30m");
			}
		}

		while (true) {
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("Q8) 누군가가 내 블로그에 악플을 달았다!");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("0. 말도 안 되는 소리다. 논리적으로 반박해볼까?");
			System.out.println("1. 기분이 나쁘다. 저런 식으로 댓글 남기면 보는 사람 상처받는거 모르나?");
			System.out.print("응답 >>> ");
			mbtiDTO.setQuestion08(util.numberCheck());
			if (mbtiDTO.getQuestion08() < 2) {
				System.out.println("\n");
				break;
			} else {
				System.out.println("\u001B[31m" + "0 또는 1로 응답하세요\n" + "\u001B[30m");
			}
		}

		while (true) {
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("Q9) ");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("0. ");
			System.out.println("1. ");
			System.out.print("응답 >>> ");
			mbtiDTO.setQuestion09(util.numberCheck());
			if (mbtiDTO.getQuestion09() < 2) {
				System.out.println("\n");
				break;
			} else {
				System.out.println("\u001B[31m" + "0 또는 1로 응답하세요\n" + "\u001B[30m");
			}
		}
		mbtiDTO.getFtScore();
		mbtiDTO.setFtResult();

		while (true) {
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("Q10) 다음 날 아침이 밝았다. 일어나자마자 나는 ... ");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("0. \'아... 피곤하다.\' 슬슬 일어나 느긋하게 준비한다.");
			System.out.println("1. 시계를 보며 준비할 시간이 얼마나 남았는지 계산해본다.");
			System.out.print("응답 >>> ");
			mbtiDTO.setQuestion10(util.numberCheck());
			if (mbtiDTO.getQuestion10() < 2) {
				System.out.println("\n");
				break;
			} else {
				System.out.println("\u001B[31m" + "0 또는 1로 응답하세요\n" + "\u001B[30m");
			}
		}

		while (true) {
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("Q11) 준비를 마치고 버스 시간을 봤더니 간당간당하다.");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("0. \'택시 타고 가지 뭐ㅎㅎ\' 별로 신경쓰지 않는다.");
			System.out.println("1. \'하... 오늘도 택시 타고 가야되나...\' 택시를 타면 제 시간에 도착할 수 있을지 계산해본다.");
			System.out.print("응답 >>> ");
			mbtiDTO.setQuestion11(util.numberCheck());
			if (mbtiDTO.getQuestion11() < 2) {
				System.out.println("\n");
				break;
			} else {
				System.out.println("\u001B[31m" + "0 또는 1로 응답하세요\n" + "\u001B[30m");
			}
		}

		while (true) {
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("Q12) 겨우 시간 맞춰 버스를 타고 가는 나, 버스를 타고 가며 앞으로의 각오를 다진다.");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("0. 나는 아직 무엇을 해야 할 지 모르겠다. 앞으로의 6개월은 소중한 경험이 될 것이다.");
			System.out.println("1. 나는 무엇을 해야 하는지 안다. 앞으로의 6개월은 그 길로 향하는 과정이다.");
			System.out.print("응답 >>> ");
			mbtiDTO.setQuestion12(util.numberCheck());
			if (mbtiDTO.getQuestion12() < 2) {
				System.out.println("\n");
				break;
			} else {
				System.out.println("\u001B[31m" + "0 또는 1로 응답하세요\n" + "\u001B[30m");
			}
		}
		mbtiDTO.getJpScore();
		mbtiDTO.setJpResult();
		mbtiDTO.getYourType();
		resultList.add(mbtiDTO);
		System.out.println("당신은" + mbtiDTO.getYourType() + "입니다");
//		System.out.println(mbtiDTO.getEiResult() + mbtiDTO.getNsResult() + mbtiDTO.getFtResult() + mbtiDTO.getJpResult());
		
		
	}
	
	// 관리자용 기능이므로 지금은 필요 ㄴㄴ
	public void findAll() {
		List<MbtiDTO> list = mbtiRepository.findAll();
		System.out.println("\n");
		System.out.println("구분\t\t\t\t\t테스트결과\t\t\t\t테스트날짜");
		System.out.println("──────────────────────────────────────────────────────────────────────────────────");
		for (MbtiDTO mbtiDTO : list) {
			System.out.println(mbtiDTO.toString());
		} 
		System.out.println("──────────────────────────────────────────────────────────────────────────────────");

	}
	
	// Student에서 가져옴
//	public void findById() {
//		System.out.print("조회할 학번 >>> ");
//		String sno = sc.next();
//		
//		StudentDTO studentDTO = repository.findById(sno);
//		
//		if (studentDTO == null) {
//			System.out.println("조회할 수 없는 학번입니다");
//		} else {
//			System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
//			System.out.println("-----------------------------------------------------------");		
//			System.out.println(studentDTO.toString());
//		}
//	}
	
	// Client에서 가져옴
//	public void findById() {
//		TestDTO testDTO = testRepository.findById(loginNick, loginPassword);
//
//		if (testDTO == null) {
//			System.out.println("로그인 오류");
//
//		} else {
//			System.out.println("구분\t\t\t\t\t테스트결과\t\t\t\t테스트날짜");
//			System.out.println("──────────────────────────────────────────────────────────────────────────────────");
//			System.out.println(mbtiDTO.toString());
//			System.out.println(
//					"----------------------------------------------------------------------------------------------------");
//			List<BreakdownDTO> bList = repository.breakList(clientDTO.getAccount());
//			if (bList.size() == 0) {
//				System.out.println("입출금 내역이 없습니다");
//			} else {
//				System.out.println(" ▼ 입출금내역 ▼ ");
//				System.out.println("계좌번호\t\t구분\t거래금액\t거래후잔액\t거래일");
//				System.out.println(
//						"----------------------------------------------------------------------------------------------------");
//				for (BreakdownDTO b : bList) {
//					System.out.println(b.toString());
//				}
//
//			}
//
//		}
//
//	}
//

	
	
	


}
