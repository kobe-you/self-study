package cn.kobe.controller;

import cn.kobe.bean.Buy;
import cn.kobe.bean.Collection;
import cn.kobe.bean.Course;
import cn.kobe.dto.PageResult;
import cn.kobe.dto.Result;
import cn.kobe.service.CollectionService;
import cn.kobe.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 19:28
 * @Describe
 */
@Controller
@RequestMapping("/collection")
public class CollectionController {
    @Autowired
    private CollectionService collectionService;

    @RequestMapping("/selectAll/{page}/{size}")
    @ResponseBody
    public PageResult<Collection> selectAll(@PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Collection> pageResult = new PageResult<Collection>();
        List<Collection> collections = collectionService.selectAll(pageNumber, pageSize);
        pageResult.setData(collections);
        pageResult.setCode("200");
        pageResult.setTotal(collections.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }

    @RequestMapping("/del/{id}")
    @ResponseBody
    public Result<String> deleteByPrimaryKey(@PathVariable("id") String collectionId) {
        int i = collectionService.deleteByPrimaryKey(collectionId);
        if(i == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result<String> insert(@RequestBody Collection collection) {
        collection.setIsDelete(false);
        collection.setCollectionTime(new Date());
        int insert = collectionService.insert(collection);
        if(insert == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result<String> updateByPrimaryKey(@RequestBody Collection collection) {
        int result = collectionService.updateByPrimaryKey(collection);
        if(result == 1) {
            return new Result<String>(Status.SUCCESS, "success","");
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/selectOne/{id}")
    @ResponseBody
    public Result<Collection> selectByPrimaryKey(@PathVariable("id") String collectionId) {
        Collection collection = collectionService.selectByPrimaryKey(collectionId);
        if(collection != null) {
            return new Result<Collection>(Status.SUCCESS, "success", collection);
        }
        return new Result<Collection>(Status.SYSTEM_OF_ERROR, "system of error",collection);
    }

    @RequestMapping("/searchByName/{name}/{page}/{size")
    @ResponseBody
    public PageResult<Collection> selectByName(@PathVariable("name") String name, @PathVariable("page") Integer pageNumber, @PathVariable("size")  Integer pageSize) {
        pageNumber--;
        PageResult<Collection> pageResult = new PageResult<Collection>();
        name = "%" + name + "%";
        List<Collection> collections = collectionService.selectByName(name, pageNumber, pageSize);
        pageResult.setData(collections);
        pageResult.setCode("200");
        pageResult.setTotal(collections.size());
        pageResult.setPageNumber(pageNumber);
        pageResult.setPageSize(pageSize);
        return pageResult;
    }

    @RequestMapping("/startCollection")
    @ResponseBody
    public Result<String> startCollection(@RequestBody String[] arr) {
        for(int i=0;i<arr.length;i++) {
            Integer result = collectionService.startCollection(arr[i]);
            System.out.println(arr[i]);
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/banCollection")
    @ResponseBody
    public Result<String> banCollection(@RequestBody String[] arr) {
        for(int i=0;i<arr.length;i++) {
            Integer result = collectionService.banCollection(arr[i]);
            System.out.println(arr[i]);
        }
        return new Result<String>(Status.SYSTEM_OF_ERROR, "system of error","");
    }

    @RequestMapping("/isCollected/{studentId}/{courseId}")
    @ResponseBody
    public Result<String> isCollected(@PathVariable("studentId") String studentId ,@PathVariable("courseId") String courseId) {
        List<Collection> result = collectionService.isCollected(studentId, courseId);
        if(result.size() > 0) {
            return new Result<String>(Status.SUCCESS, "success",""+result.size());
        }
        else {
            return new Result<String>(Status.SYSTEM_OF_ERROR, "error","");
        }
    }

}
