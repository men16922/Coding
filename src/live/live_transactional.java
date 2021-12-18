package live;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class live_transactional {
	private final UserRepository userRepository;
	private final BCryptPasswordEncoder passwordEncoder;

	public List<User> getUserList() {
		return userRepository.findAll();
	}

	@Transactional
	public User signUp(final SignUpDTO signUpDTO) {
		final User user = User.builder().email(signUpDTO.getEmail()).pw(passwordEncoder.encode(signUpDTO.getPw()))
				.role(UserRole.ROLE_USER).build();
		return userRepository.save(user);
	}
}
