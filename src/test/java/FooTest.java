import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FooTest {

	@Test
	void should_cover_foo_partially() {
		assertThat(Foo.coveredByUnitTests()).isTrue();
	}
}
