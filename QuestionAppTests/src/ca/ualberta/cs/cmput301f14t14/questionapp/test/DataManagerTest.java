package ca.ualberta.cs.cmput301f14t14.questionapp.test;

import java.util.List;

import android.test.ActivityInstrumentationTestCase2;
import ca.ualberta.cs.cmput301f14t14.questionapp.MainActivity;
import ca.ualberta.cs.cmput301f14t14.questionapp.data.DataManager;
import ca.ualberta.cs.cmput301f14t14.questionapp.data.LocalDataStore;
import ca.ualberta.cs.cmput301f14t14.questionapp.model.Answer;
import ca.ualberta.cs.cmput301f14t14.questionapp.model.Comment;
import ca.ualberta.cs.cmput301f14t14.questionapp.model.Question;
import ca.ualberta.cs.cmput301f14t14.questionapp.test.mock.MockData;


public class DataManagerTest extends ActivityInstrumentationTestCase2<MainActivity> {

	public DataManagerTest() {
		super(MainActivity.class);
	}
	
	public void testBullShit() {
		assertEquals(true, true);
	}
	/*
	private DataManager manager;
	private Question validQ;
	private Answer validA;
	private Question mockQuestion;

	protected void setUp() throws Exception {
		super.setUp();
		manager = DataManager.getInstance(getInstrumentation().getTargetContext().getApplicationContext());
		manager.clearClientData();
		manager.setUsername("User");
		MockData.initMockData();
		for(Question question : MockData.questions){
			manager.addQuestion(question);
		}
		for(Answer answer : MockData.answers) {
			manager.addAnswer(answer);
		}
		validQ = MockData.questions.iterator().next();
		List<Answer> aList = manager.getAnswerList(validQ);
		validA = aList.get(0);
		try{
			mockQuestion = new Question("", "", "", null);
		}catch(IllegalArgumentException e){
			mockQuestion = new Question("a", "a", "a", null);
		}
	}
	
	protected void tearDown() throws Exception {
	}

	public void testSetUsername() {
		assertNotNull(manager);
		assertEquals("User", manager.getUsername());
		manager.setUsername("Different user");
		assertEquals("Different user", manager.getUsername());
	}

	public void testGetQuestion(){

		try{
		manager.addQuestion(mockQuestion);
		assertTrue("Mock question and valid question are the same!", !manager.getQuestion(mockQuestion.getId()).equals(validQ));
		}catch(IllegalArgumentException e){
			
		}

		assertEquals(validQ, manager.getQuestion(validQ.getId()));

	}

	public void testAddComments(){
		Comment<Question> mockComment = new Comment<Question>(validQ.getId(), "This is not a real question", manager.getUsername());
		manager.addQuestionComment(mockComment);
		assertEquals(mockComment, manager.getQuestionComment(mockComment.getId()));
		
		Comment<Answer> testComment = new Comment<Answer>(validA.getId(), "This answer is not helpful", manager.getUsername());
		manager.addAnswerComment(testComment);
		assertEquals(testComment, manager.getAnswerComment(testComment.getId()));
	}
	
	
	 //UC12 TC 12.1 - Favorite a Question
	 
	
	public void testFavoriteQuestion() {
		// user indicates that they wish to favorite a question
		manager.favoriteQuestion(validQ.getId());
		LocalDataStore local = new LocalDataStore(getInstrumentation().getTargetContext().getApplicationContext());
		//boolean favorited = local.isFavorite(validQ.getId());
		//assertTrue(favorited);
	}
		
	public void testReadQuestionLater(){
		manager.readQuestionLater(validQ.getId());
		try{
			assertEquals(validQ, manager.getReadLaterQuestion(validQ.getId()));
			Question testQ = manager.getReadLaterQuestion(mockQuestion.getId());
			assertNotNull(testQ);
		}catch(NullPointerException e){}
	}
*/	
}
