package payroll;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository, CharacterRepository characterRepository,
								   QuoteRepository quoteRepository) {
		return args -> {

			log.info("Preloading" + quoteRepository.save(new Quote(
					"59edff64d9be8f7aa11e0c44",
					"59edee68706374dfa957842f",
					"Homer",
					"Simpson",
					"http://www.trbimg.com/img-573a089a/turbine/ct-homer-simpson-live-pizza-debate-met-0517-20160516",
					43,
					"Wait a minute. Bart’s teacher is named ‘Krabappel’? Oh, I’ve been calling her ‘Crandall.’ Why didn’t anyone tell me? Ohhh, I’ve been making an idiot out of myself!"
			)));
			log.info("Preloading" + quoteRepository.save(new Quote(
					"59edff6492d619b4a933a56b",
					"59edee68706374dfa957842f",
					"Homer",
					"Simpson",
					"http://www.trbimg.com/img-573a089a/turbine/ct-homer-simpson-live-pizza-debate-met-0517-20160516",
					43,
					"Now we play the waiting game…Ahh, the waiting game sucks. Let’s play Hungry Hungry Hippos!"
			)));
			log.info("Preloading" + quoteRepository.save(new Quote(
					"59edff6477ac8539e526682b",
					"59edee689509e51682ff8e02",
					"Marge",
					"Simpson",
					"https://vignette.wikia.nocookie.net/simpsons/images/8/87/Marge_Simpson_2.png/revision/latest?cb=20150131104556",
					40,
					"Go out on a Tuesday? Who am I, Charlie Sheen?"
			)));
			log.info("Preloading" + quoteRepository.save(new Quote(
					"59edff6477ac8539e526682b",
					"59edee689509e51682ff8e02",
					"Marge",
					"Simpson",
					"https://vignette.wikia.nocookie.net/simpsons/images/8/87/Marge_Simpson_2.png/revision/latest?cb=20150131104556",
					40,
					"Go out on a Tuesday? Who am I, Charlie Sheen?"
			)));
			log.info("Preloading" + quoteRepository.save(new Quote(
					"59edff647cf388e225bc5f4e",
					"59edee689509e51682ff8e02",
					"Marge",
					"Simpson",
					"https://vignette.wikia.nocookie.net/simpsons/images/8/87/Marge_Simpson_2.png/revision/latest?cb=20150131104556",
					40,
					"I brought you a tuna sandwich. They say it's brain food. I guess because there's so much dolphin in it, and you know how smart they are."
			)));
			log.info("Preloading" + quoteRepository.save(new Quote(
					"59edff64ac4dccc4b0e35784",
					"59edee68eff3f80413c136f8",
					"Lisa",
					"Simpson",
					"https://vignette.wikia.nocookie.net/simpsons/images/1/12/Lisa_Simpson-0.png/revision/latest?cb=20161027220133",
					10,
					"I’d be mortified if someone ever made a lousy product with the Simpson name on it."
			)));
			log.info("Preloading" + quoteRepository.save(new Quote(
					"59edff6419f9d6df24d593fe",
					"59edee68eff3f80413c136f8",
					"Lisa",
					"Simpson",
					"https://vignette.wikia.nocookie.net/simpsons/images/1/12/Lisa_Simpson-0.png/revision/latest?cb=20161027220133",
					10,
					"You monster! You monster!"
			)));
			log.info("Preloading" + quoteRepository.save(new Quote(
					"59edff6403042a54f6038044",
					"59edee683406c7834ee7cdd8",
					"Bart",
					"Simpson",
					"https://vignette.wikia.nocookie.net/simpsons/images/a/ab/BartSimpson.jpg/revision/latest?cb=20141101133153",
					12,
					"There’s only one thing to do at a moment like this: strut!"
			)));
			log.info("Preloading" + quoteRepository.save(new Quote(
					"59edff643d4737e47c71835c",
					"59edee683406c7834ee7cdd8",
					"Bart",
					"Simpson",
					"https://vignette.wikia.nocookie.net/simpsons/images/a/ab/BartSimpson.jpg/revision/latest?cb=20141101133153",
					12,
					"Aren’t we forgetting the true meaning of Christmas: the birth of Santa."
			)));
			log.info("Preloading" + quoteRepository.save(new Quote(
					"59edff641b4c1f62aebe1e4d",
					"59edee68b4b101bef064bf11",
					"Hugo",
					"Simpson",
					"https://static.simpsonswiki.com/images/thumb/1/1a/Hugo_Simpson.png/200px-Hugo_Simpson.png",
					12,
					"I made a Pigeon-rat."
			)));
			log.info("Preloading" + quoteRepository.save(new Quote(
					"59edff643fbeca90867aa34d",
					"59edee68b4b101bef064bf11",
					"Hugo",
					"Simpson",
					"https://static.simpsonswiki.com/images/thumb/1/1a/Hugo_Simpson.png/200px-Hugo_Simpson.png",
					12,
					"Am I? Well, perhaps we're all a little crazy. I know I am. " +
							"I went mad after they tore us apart, but I'll be sane… once I sew us back together."
			)));
			log.info("Preloading" + quoteRepository.save(new Quote(
					"59edff6494f9aef192ef4813",
					"59edee68874eb2fa23678344",
					"Ned",
					"Flanders",
					"https://vignette.wikia.nocookie.net/simpsons/images/8/84/Ned_Flanders.png/revision/latest?cb=20100513160156",
					50,
					"Diddly"
			)));
			log.info("Preloading" + quoteRepository.save(new Quote(
					"59edff64e6597a07e8e5dd33",
					"59edee68874eb2fa23678344",
					"Ned",
					"Flanders",
					"https://vignette.wikia.nocookie.net/simpsons/images/8/84/Ned_Flanders.png/revision/latest?cb=20100513160156",
					50,
					"I give you the jury of the damned. Benedict Arnold, Lizzie Borden, Richard Nixon..."
			)));
			log.info("Preloading" + quoteRepository.save(new Quote(
					"59edff6458b6a68631660120",
					"59edee68efd448eefb265420",
					"Rod",
					"Flanders",
					"https://vignette.wikia.nocookie.net/simpsons/images/e/e6/Rod_Flanders2.png/revision/latest?cb=20140817110904",
					13,
					"We just move one space at a time. It's less fun that way."
			)));
			log.info("Preloading" + quoteRepository.save(new Quote(
					"59edff646c740f1218a30a06",
					"59edee68efd448eefb265420",
					"Rod",
					"Flanders",
					"https://vignette.wikia.nocookie.net/simpsons/images/e/e6/Rod_Flanders2.png/revision/latest?cb=20140817110904",
					13,
					"Thank you, door!"
			)));
			log.info("Preloading" + quoteRepository.save(new Quote(
					"59edff644abadfc108cac2a6",
					"59edee68ea392a3947485d41",
					"Todd",
					"Flanders",
					"https://vignette.wikia.nocookie.net/simpsons/images/1/18/Todd_Flanders.png/revision/latest?cb=20131223200228",
					12,
					"Daddy says dice are wicked."
			)));
			log.info("Preloading" + quoteRepository.save(new Quote(
					"59edff64fd7790417d74b3a1",
					"59edee682c7acf7bfac7e66b",
					"Maude",
					"Flanders",
					"https://vignette.wikia.nocookie.net/simpsons/images/9/95/Maude_Flanders.png/revision/latest/scale-to-width-down/286?cb=20170923223722",
					49,
					"Oh, I don't care for the speed, but I can't get enough of that safety gear - helmets, roll bars, caution flags..."
			)));
			log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
			log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
			log.info("Preloading " + characterRepository.save(new Character(
					"59edee68706374dfa957842f",
					"Homer",
					"Simpson",
					"http://www.trbimg.com/img-573a089a/turbine/ct-homer-simpson-live-pizza-debate-met-0517-20160516",
					43,
					"59edff6492d619b4a933a56b",
					"Now we play the waiting game…Ahh, the waiting game sucks. Let’s play Hungry Hungry Hippos!")));
		};
	}
}
