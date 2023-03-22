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
	private MbtiRepository mbtiRepository = MbtiRepository.getInstance();
//	MbtiDTO mbtiDTO = new MbtiDTO();
		
	List<MbtiDTO> resultList = new ArrayList<>();

	public void mbtiSave() {
		MbtiDTO mbtiDTO = new MbtiDTO();
		while (true) {
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("Q1) 수강 첫 날 ... ");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("0. \'잘 할 수 있을까...?\' 오만가지 걱정이 앞선다. ");
			System.out.println("1. 새로운 친구를 사귈 생각에 설렌다.");
			System.out.print("응답 >>> ");
			mbtiDTO.setQuestion01(sc.nextInt());
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
			mbtiDTO.setQuestion02(sc.nextInt());
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
			mbtiDTO.setQuestion03(sc.nextInt());
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
			mbtiDTO.setQuestion04(sc.nextInt());
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
			System.out.println("1. 이론 위주로 두루뭉슬하게 알려준다.");
			System.out.print("응답 >>> ");
			mbtiDTO.setQuestion05(sc.nextInt());
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
			System.out.println("0. \'집에 가서 빨리 밥 먹고 씻고 공부하다 자야지\' 별 생각 없이 가다보니 어느새 집 앞이다.");
			System.out.println("1. \'자고 일어났더니 천재 개발자가 된 나ㅋㅋ\' 별의 별 생각을 다 하며 가다보니 어느새 집 앞이다.");
			System.out.print("응답 >>> ");
			mbtiDTO.setQuestion06(sc.nextInt());
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
			mbtiDTO.setQuestion07(sc.nextInt());
			if (mbtiDTO.getQuestion07() < 2) {
				System.out.println("\n");
				break;
			} else {
				System.out.println("\u001B[31m" + "0 또는 1로 응답하세요\n" + "\u001B[30m");
			}
		}

		while (true) {
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("Q8) 누군가가 내 블로그를 보고 기분 나쁜 댓글을 남겼다.");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("0. 말도 안 되는 소리다. 논리적으로 반박한다.");
			System.out.println("1. 태도가 마음에 안 든다. 저런 식으로 댓글 쓰면 상처받는다.");
			System.out.print("응답 >>> ");
			mbtiDTO.setQuestion08(sc.nextInt());
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
			mbtiDTO.setQuestion09(sc.nextInt());
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
			mbtiDTO.setQuestion10(sc.nextInt());
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
			System.out.println("0. \'택시타고 가지 뭐ㅎㅎ\' 별로 신경쓰지 않는다.");
			System.out.println("1. \'하... 택시 타야되나...\' 택시를 타면 제 시간에 도착할 수 있을지 계산해본다.");
			System.out.print("응답 >>> ");
			mbtiDTO.setQuestion11(sc.nextInt());
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
			System.out.println("0. 나는 아직 무엇을 해야 할 지 모르겠다. 이것은 그 길을 찾기 위한 과정이다.");
			System.out.println("1. 나는 이제 무엇을 해야 하는지 안다. 이것은 그 길로 향하는 과정이다.");
			System.out.print("응답 >>> ");
			mbtiDTO.setQuestion12(sc.nextInt());
			if (mbtiDTO.getQuestion12() < 2) {
				System.out.println("\n");
				break;
			} else {
				System.out.println("\u001B[31m" + "0 또는 1로 응답하세요\n" + "\u001B[30m");
			}
		}
		mbtiDTO.getJpScore();
		mbtiDTO.setJpResult();
//		System.out.println(mbtiDTO.getEiResult() + mbtiDTO.getNsResult() + mbtiDTO.getFtResult() + mbtiDTO.getJpResult());
		System.out.println(mbtiDTO.getYourType());
	}
	
	public void yourType() {
		MbtiDTO mbtiDTO = new MbtiDTO();
		System.out.println(mbtiDTO.getEiResult() + mbtiDTO.getNsResult() + mbtiDTO.getFtResult() + mbtiDTO.getJpResult());
	}
	
//	public void yourResult () {
//		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
//		if (mbtiDTO.getEiResult("E")) {
//			System.out.println("- 당신의 에너지는 외부를 향하고 있습니다.");
//			System.out.println("- 당신은 당신의 생각이나 느낌을 주변 사람들과 이야기하기를 좋아합니다.");
//		} else {
//			System.out.println("- 당신의 에너지는 내부를 향하고 있습니다.");
//			System.out.println("- 당신은 혼자만의 시간을 통해 당신의 생각이나 느낌을 떠올리는 편입니다. ");
//		}
//		
//		if (nsScore >= 2) {
//			System.out.println("- N 장점");
//			System.out.println("- N 단점");
//		} else {
//			System.out.println("- S 장점");
//			System.out.println("- S 단점");
//		}
//		
//		if (ftScore >= 2) {
//			System.out.println("- F 장점");
//			System.out.println("- F 단점");
//		} else {
//			System.out.println("- T 장점");
//			System.out.println("- T 단점");
//		}
//		
//		if (jpScore >= 2) {
//			System.out.println("- J 장점");
//			System.out.println("- J 단점");
//		} else {
//			System.out.println("- P 장점");
//			System.out.println("- P 단점");
//		}
//	}
	
	public void yourResult() {
		System.out.println(resultList.get(0));
	}

}
