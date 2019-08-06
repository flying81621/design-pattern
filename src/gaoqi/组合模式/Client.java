package gaoqi.组合模式;

/**
 * 组合模式适用于树形结构的场景
 * @createTime 2018年3月3日 上午11:00:26
 * @author MrWang
 */
public class Client {
	public static void main(String[] args) {
		AbstractFile f1,f2,f3,f4,f5;
		
		Folder folder = new Folder("D盘");
		Folder folder2 = new Folder("我的学习");
		f1 = new TextFile("我的文档.txt");
		f2 = new ImageFile("我的图片.JPG");
		f3 = new VideoFile("我的视频.mp4");
		
		folder.add(f2);
		folder.add(f3);

		folder2.add(f1);
		folder.add(folder2);
		
		folder.killVirus();
	}
}
