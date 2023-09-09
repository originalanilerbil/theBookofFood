package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.anilerbil.thebookoffood.DataBinderMapperImpl());
  }
}
