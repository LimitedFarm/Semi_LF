package LF.common;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.oreilly.servlet.multipart.FileRenamePolicy;

public class MyFileRenamePolicy implements FileRenamePolicy {

	@Override
	public File rename(File originFile) {
		long currentTime = System.currentTimeMillis(); // 현재 시간을 밀리 세컨 단위의 long 형으로 변환해주는 메소드		
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyymmddHHmmss");
		int ranNum = (int)(Math.random()*100000);
		
		//확장자명 가져오기!
		
		String name = originFile.getName(); //원본 파일 명
		String ext = null; // 확장자만 저장할 변수
		
		int dot = name.lastIndexOf(".");
		
		
		if(dot != -1) {
			ext = name.substring(dot);
		}else {
			ext="";
		}
		
		String fileName = ft.format(new Date(currentTime)) + ranNum + ext;
		File  newFile = new File(originFile.getParent(), fileName);
		
		
	
		
		return newFile;
	}

}
