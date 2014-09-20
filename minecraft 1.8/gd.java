/*   1:    */ import java.io.DataInput;
/*   2:    */ import java.io.DataOutput;
/*   3:    */ 
/*   4:    */ public abstract class gd
/*   5:    */ {
/*   6: 21 */   public static final String[] a = { "END", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BYTE[]", "STRING", "LIST", "COMPOUND", "INT[]" };
/*   7:    */   
/*   8:    */   abstract void a(DataOutput paramDataOutput);
/*   9:    */   
/*  10:    */   abstract void a(DataInput paramDataInput, int paramInt, fx paramfx);
/*  11:    */   
/*  12:    */   public abstract String toString();
/*  13:    */   
/*  14:    */   public abstract byte a();
/*  15:    */   
/*  16:    */   protected static gd a(byte paramByte)
/*  17:    */   {
/*  18: 55 */     switch (paramByte)
/*  19:    */     {
/*  20:    */     case 0: 
/*  21: 57 */       return new fr();
/*  22:    */     case 1: 
/*  23: 59 */       return new fm();
/*  24:    */     case 2: 
/*  25: 61 */       return new gb();
/*  26:    */     case 3: 
/*  27: 63 */       return new fu();
/*  28:    */     case 4: 
/*  29: 65 */       return new fw();
/*  30:    */     case 5: 
/*  31: 67 */       return new fs();
/*  32:    */     case 6: 
/*  33: 69 */       return new fq();
/*  34:    */     case 7: 
/*  35: 71 */       return new fl();
/*  36:    */     case 11: 
/*  37: 73 */       return new ft();
/*  38:    */     case 8: 
/*  39: 75 */       return new gc();
/*  40:    */     case 9: 
/*  41: 77 */       return new fv();
/*  42:    */     case 10: 
/*  43: 79 */       return new fn();
/*  44:    */     }
/*  45: 81 */     return null;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public abstract gd b();
/*  49:    */   
/*  50:    */   public boolean c_()
/*  51:    */   {
/*  52:122 */     return false;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public boolean equals(Object paramObject)
/*  56:    */   {
/*  57:127 */     if (!(paramObject instanceof gd)) {
/*  58:128 */       return false;
/*  59:    */     }
/*  60:130 */     gd localgd = (gd)paramObject;
/*  61:131 */     if (a() != localgd.a()) {
/*  62:132 */       return false;
/*  63:    */     }
/*  64:134 */     return true;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public int hashCode()
/*  68:    */   {
/*  69:139 */     return a();
/*  70:    */   }
/*  71:    */   
/*  72:    */   protected String a_()
/*  73:    */   {
/*  74:143 */     return toString();
/*  75:    */   }
/*  76:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     gd
 * JD-Core Version:    0.7.0.1
 */