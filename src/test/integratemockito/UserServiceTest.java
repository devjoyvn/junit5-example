package integratemockito;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.commons.util.ReflectionUtils;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService = new UserService(userRepository);

    @BeforeEach
    public void beforeEach() {
        List<User> users = new ArrayList<>();
        users.add(new User("1", "Hai"));
        users.add(new User("2", "Hieu"));
        users.add(new User("3", "oanh"));
        users.add(new User("4", "Hai"));
        Mockito.when(userRepository.findAll()).thenReturn(users);
    }

    @Test
    public void findAndGroupUserByNameTest() {
        Map<String, List<User>> map = userService.findAndGroupUserByName("H");
        Assertions.assertNotNull(map);
        Assertions.assertEquals(map.size(), 2);
        Assertions.assertEquals(map.get("Hai").size(), 2);
        Assertions.assertEquals(map.get("Hieu").size(), 1);
    }
}


