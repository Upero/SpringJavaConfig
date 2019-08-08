package concert;

import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements Performance{
		@Override
		public void perform(String str) {
			System.out.println("performance is begging " + str);
		}
}
