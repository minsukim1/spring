package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) // 테스트 시 필요한 클래스
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") // 어떤 설정 정보를 읽어 들여야 하는지
@Log4j	// 로그 객체를 생성하게 된다.
public class SampleTests {

	@Setter(onMethod_ = { @Autowired }) // setter 메서드를 생성해 주는 역할 , @Autowired = 해당 타입의 빈을 주입해줘라
										// @Data lombok에서 가장 자주사용되는 어노테이션, 한 번에 자주 사용되는 모든 메서드들을 생성해줌
										// @Component 해당 클래스가 스프링에서 객체로 만들어서 관리하는 대상임을 명시하는 어노테이션
	private Restaurant restaurant;
	
	@Test // junit에서 해당 메서드가 단위 테스트의 대상인지 알려준다
	public void testExist() {
		
		assertNotNull(restaurant);
	
		log.info(restaurant);
		log.info("--------------------------");
		log.info(restaurant.getChef());
	}
}
