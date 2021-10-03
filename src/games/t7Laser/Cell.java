package games.t7Laser;

import org.newdawn.slick.Image;

import app.AppLoader;

public class Cell {

	public static final int NORMAL_TYPE = 0 ;
	public static final int MINE_TYPE = 1 ;
	public static final int BONUS_TYPE = 2 ;
	public static final int QRCODE_TYPE = 3 ;

	private Image NORMAL;
	private Image MINE;
	private Image BONUS;
	private Image QRCODE_BLACK;
	private Image QRCODE_WHITE;

	//Variables
	private Boolean contains;
	private Boolean deadly;
	private Boolean hasBonus;
	private boolean hasEnnemy;

	private int imageType;
	private int i;
	private int j;

	//Constructeur
	public Cell(int i, int j) {
		this.contains = false;
		this.deadly = false;
		this.hasBonus=false;
		this.hasEnnemy = false;
		this.i=i;
		this.j=j;

		if(NORMAL==null){
			NORMAL=AppLoader.loadPicture(World.DIRECTORY_IMAGES+"Cell.png");
			MINE=AppLoader.loadPicture(World.DIRECTORY_IMAGES+"Mine.png");
			BONUS=AppLoader.loadPicture(World.DIRECTORY_IMAGES+"Bonus.png");
			QRCODE_BLACK=AppLoader.loadPicture(World.DIRECTORY_IMAGES+"QRCode_black.png");
			QRCODE_WHITE=AppLoader.loadPicture(World.DIRECTORY_IMAGES+"QRCode_white.png");
		}
	}

	//Getters et Setters
	public Boolean getContains() {
		return contains;
	}

	public void setContains(Boolean contains) {
		this.contains = contains;
	}

	public Boolean getDeadly() {
		return deadly;
	}

	public void setDeadly(Boolean deadly) {
		this.deadly = deadly;
		if(this.imageType == MINE_TYPE)
			this.deadly = true;
	}

	public int getImageType() {
		return imageType;
	}

	public void setImageType(int imageType) {
		this.imageType = imageType;
	}

	public Image getImage() {
		if(imageType==MINE_TYPE)return MINE;
		else if(imageType==NORMAL_TYPE)return NORMAL;
		else if(imageType==BONUS_TYPE)return BONUS;
		else if(imageType==QRCODE_TYPE) {
			if (j==0&&(i<7||i>8&&i<13||i==14||i>=18)||j==1&&(i==0||i==6||i==18||i==24||i>10&&i<=16)||j==2&&(i==0||i>=2&&i<=4||i==6||i>7&&i<=9||i==13||i>=15&&i<17||i==18||i>=20&&i<=22||i==24)||j==3&&(i==0||i>=2&&i<=4||i==6||i>7&&i<=10||i==12||i==14&&i==16||i==18||i>=20&&i<=22||i==24)||j==4&&(i==0||i>=2&&i<=4||i==6||i==8||i==16||i==18||i>=20&&i<=22||i==24)||j==5&&(i==0||i==6||i==18||i==24||i==8||i==10||i==12||i>=15&&i<17)||j==6&&(i<7||i%2==0||i>=18)||j==7&&(i>=8&&i<=10||i==14)||j==8&&(i<7&&i!=1||i==10||i>=15&&i<23&&i!=17)||j==9&&(i<4&&i!=1||i==7||i==9||i>=12&&i<=14||i==16||i==19||i==24)||j==10&&(i!=0&&i!=2&&i!=5&&i!=7&&i!=10&&i!=16&&i!=22)||j==11&&(i==1||i==2||i==4||i>=7&&i<=9||i==13||i>=15&&i<=18||i==23)||j==12&&(i>1&&i!=5&&i!=7&&i!=8&&i!=13&&i!=21)||j==13&&(i==0||i==4||i==8||i>=16&&i!=18&&i!=20&&i!=23)||j==14&&(i!=1&&i!=8&&i!=10&&i!=13&&i!=14&&i!=17&&i!=20&&i!=21)||j==15&&(i==0||i==7||i>=9&&i<=11||i==14||i==15||i==24)||j==16&&(i!=1&&i!=5&&i!=8&&i!=9&&(i<=11||i>=15)&&i!=21&&i!=22)||j==17&&(i==8||i>=12&&i<=16||i==21||i==23||i==24)||j==18&&(i<7||i==9||i>12&&i!=15&&i!=17&&i!=19&&i!=22)||j==19&&(i==0||i==6||i==8||i==10||i==12||i==13||i==16||i>=20&&i!=22)||j==20&&(i<=9&&i!=1&&i!=5&&i!=7||i>=12&&i!=14&&i!=21&&i!=23)||j==21&&(i<=10&&i!=1&&i!=5&&i!=7||i==16||i==18||i==20||i>=23)||j==22&&(i<=12&&i!=1&&i!=5&&i!=7||i==15||i==17||i==19||i==22||i==24)||j==23&&(i==0||i==6||i>=10&&i<=18&&i!=12&&i!=13&&i!=16||i==24)||j==24&&(i<7||i==8||i==10||i==11||i>17&&i!=22))
				return QRCODE_BLACK;
			else return QRCODE_WHITE;
		}
		return NORMAL;
	}

	public boolean isHasEnnemy() {
		return hasEnnemy;
	}

	public void setHasEnnemy(boolean hasEnnemy) {
		this.hasEnnemy = hasEnnemy;
	}

	public Boolean getHasBonus() {
		return hasBonus;
	}

	public void setHasBonus(Boolean hasBonus) {
		this.hasBonus = hasBonus;
	}

}
