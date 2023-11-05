package hello.core;

import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoAppConfigTest {

    @Test
    void basicScan() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

        System.out.println(ac.getBean("memoryMemberRepository", MemoryMemberRepository.class));


    }
}
