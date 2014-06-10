package com.bloc.classes;

public class Dog {
    // The length of hair which
    final float HAIR_CUT_LENGTH = 0.15f;
    // Minimu hair lenght of the dog
    final float MIN_HAIR_LENGHT = 0f;
    // Minimum weight that any Dog can be
    final float MIN_WEIGHT = 1.25f;
	// Amount of weight to gain after eating
	final float WEIGHT_GAIN = 0.25f;
	// Amount of weight to lose after playing
	final float WEIGHT_LOSS = 0.2f;
	// Hair length
	float mHairLength;
	// Gender, either "male" or "female"
	String mGender;
	// Size, either "tiny", "small", "average", or "large"
	String mSize;
	// Its age
	int mAge;
	// Its weight in pounds
	float mWeight;
	// The color of its coat
	String mColor;
	// MSIZE Array
	String [] MSIZE = {"tiny","small","average","large"};

	int mDogFeed;
	// Which size inside the array MSIZE this Dog currently is
	int mSizeIndex;
	// Number of itmes the dog plays
	int mDogPlay;


	// ADD MEMBER VARIABLES HERE IF NECESSARY

	/*{
		Dog scruff = new Dog();
		scruff.setHairLength(12f);
		scruff.setColor("Blue");
		scruff.setWeight(54f);
		scruff.setAge(20);
	}

	/*
	 * getHairLength
	 * @return this Dog's hair length
	 */
	float getHairLength(){
		return mHairLength;
	}
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	/*
	 * setHairLength
	 * Sets the length of the Dog's hair
	 * @param hairLength the new length of the hair, a float
	 * @return nothing
	 */
	void setHairLength(float hairLength){
		mHairLength = hairLength;
	}
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	/*
	 * getGender
	 * @return this Dog's gender
	 */
	String getGender(){
		return mGender;
	}
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	/*
	 * setGender
	 * Sets this Dog's gender
	 * @param gender the new gender of the Dog, a String
	 * @return nothing
	 */
		void setGender(String genderDog){
			mGender = genderDog;
		}
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	/*
	 * getSize
	 * @return the size of the dog
	 */
		String getSize() {
			return mSize;
		}
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	/*
	 * setSize
	 * Sets the size of the Dog
	 * @param size the new size of the Dog, a String
	 * @return nothing
	 */
		void setSize(String sizeDog){ // sizeDog = "large", mSizeIndex = 3
			mSize = sizeDog;
			switch (sizeDog){
					case "tiny":
						mSizeIndex = 0;
						break;
					case "small":
						mSizeIndex = 1;
						break;
					case "average":
						mSizeIndex = 2;
						break;
					case "large":
						mSizeIndex = 3;	
					default: 
						mSizeIndex = 2;
				}
		}
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	/*
	 * getAge
	 * @return this Dog's age
	 */
		int getAge(){
			return mAge;
		}
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	/*
	 * setAge
	 * Sets the age of the Dog
	 * @param age the new age of the Dog, an int
	 * @return nothing
	 */
		void setAge(int ageDog){
			mAge = ageDog;
		}
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	/*
	 * getWeight
	 * @return this Dog's weight
	 */
		float getWeight(){
			return mWeight;
		}
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	/*
	 * setWeight
	 * Sets the weight of the Dog
	 * @param weight the new weight of the Dog, a float
	 * @return nothing
	 */
		void setWeight(float weightDog){
			mWeight = weightDog;
		}
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	/*
	 * getColor
	 * @return this Dog's color
	 */
		String getColor(){
			return mColor;
		}
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	/*
	 * setColor
	 * Sets the color of the Dog
	 * @param color the new color of the Dog's coat, a String
	 * @return nothing
	 */
		void setColor(String colorDog){
			mColor = colorDog;
		}
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	/*
	 * feed
	 * Side-effect: 1. The Dog gains weight, specifically WEIGHT_GAIN
	 *              2. Every 3 meals, the Dog grows to a larger size, if *                 possible
	 *              i.e. "tiny" (3 meals later ->) "small" (3 meals later ->)
	 *                   "average" (3 meals later ->) "large"
	 * @return nothing
	 */
		void feed(){
			mDogFeed++;
			mWeight += WEIGHT_GAIN;
			if ((mDogFeed % 3 == 0) && (mSizeIndex < (MSIZE.length - 1))) {
					mSize = MSIZE[mSizeIndex + 1];
					mSizeIndex++;
			}
		}
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	/*
	 * play
	 * Side-effect: 1. The Dog loses weight, specifically WEIGHT_LOSS
	 *				2. Every 6 play invocations, the Dog shrinks to a smaller *                 size, if possible
	 *				i.e. "large" (6 plays later->) "average" (6 plays later->) *                   "small" -> "tiny"
     *              3. The Dog cannot shrink to a weight smaller than *                 MIN_WEIGHT
	 * @return nothing
	 */
	void play(){
		mDogPlay++;
		mWeight -= WEIGHT_LOSS;
			if ((mDogPlay % 6 == 0) && (mWeight < MIN_WEIGHT)){
				mSize = MSIZE[mSizeIndex - 1];
				mSizeIndex--;
			}
	}
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	/*
	 * cutHair
	 * Side-effect: the Dog's hair length is reduced by HAIR_CUT_LENGTH
     * The Dog's hair cannot be shorter than 0f
	 * @return nothing
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	void cutHair(){
		if (MIN_HAIR_LENGHT > 0f){
			mHairLength -= HAIR_CUT_LENGTH;
			}
		}

}