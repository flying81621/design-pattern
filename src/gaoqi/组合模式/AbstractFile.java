package gaoqi.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 高淇版组合模式,模拟杀毒软件
 * @createTime 2018年3月3日 上午10:52:10
 * @author MrWang
 */
public abstract class AbstractFile {
	public abstract void killVirus();
}

/**
 * 文本杀毒
 * 
 * @createTime 2018年4月12日 下午3:36:01
 * @author MrWang
 */
class TextFile extends AbstractFile{
	private String name;
	public TextFile(String name) {
		this.name = name;
	}
	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("----文本杀毒----");
	}
	
}

/**
 * 图片杀毒
 * 
 * @createTime 2018年4月12日 下午3:36:08
 * @author MrWang
 */
class ImageFile extends AbstractFile{
	private String name;
	public ImageFile(String name) {
		this.name = name;
	}
	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("----图片杀毒----");
	}
	
}

/**
 * 视频文件杀毒
 * 
 * @createTime 2018年4月12日 下午3:36:14
 * @author MrWang
 */
class VideoFile extends AbstractFile{
	private String name;
	public VideoFile(String name) {
		this.name = name;
	}
	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("----视频文件杀毒----");
	}
	
}

/**
 * 文件夹杀毒
 * 
 * @createTime 2018年4月12日 下午3:36:23
 * @author MrWang
 */
class Folder extends AbstractFile{
	private List<AbstractFile> children = new ArrayList<>();
	private String name;
	
	public Folder(String name) {
		super();
		this.name = name;
	}

	public void add(AbstractFile file){
		children.add(file);
	}
	
	public void remove(AbstractFile file) {
		children.remove(file);
	}
	
	public void remove(int index) {
		children.remove(index);
	}
	
	public AbstractFile get(int index) {
		return children.get(index);
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("文件夹：" + name + "，进行杀毒：");
		for (AbstractFile child : children) {
			child.killVirus();
		}
	}
	
}
