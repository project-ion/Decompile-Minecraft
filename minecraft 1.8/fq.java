/*  1:   */ import java.io.DataInput;
/*  2:   */ import java.io.DataOutput;
/*  3:   */ 
/*  4:   */ public class fq
/*  5:   */   extends ge
/*  6:   */ {
/*  7:   */   private double b;
/*  8:   */   
/*  9:   */   fq() {}
/* 10:   */   
/* 11:   */   public fq(double paramDouble)
/* 12:   */   {
/* 13:17 */     this.b = paramDouble;
/* 14:   */   }
/* 15:   */   
/* 16:   */   void a(DataOutput paramDataOutput)
/* 17:   */   {
/* 18:22 */     paramDataOutput.writeDouble(this.b);
/* 19:   */   }
/* 20:   */   
/* 21:   */   void a(DataInput paramDataInput, int paramInt, fx paramfx)
/* 22:   */   {
/* 23:27 */     paramfx.a(64L);
/* 24:28 */     this.b = paramDataInput.readDouble();
/* 25:   */   }
/* 26:   */   
/* 27:   */   public byte a()
/* 28:   */   {
/* 29:33 */     return 6;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String toString()
/* 33:   */   {
/* 34:38 */     return "" + this.b + "d";
/* 35:   */   }
/* 36:   */   
/* 37:   */   public gd b()
/* 38:   */   {
/* 39:43 */     return new fq(this.b);
/* 40:   */   }
/* 41:   */   
/* 42:   */   public boolean equals(Object paramObject)
/* 43:   */   {
/* 44:48 */     if (super.equals(paramObject))
/* 45:   */     {
/* 46:49 */       fq localfq = (fq)paramObject;
/* 47:50 */       return this.b == localfq.b;
/* 48:   */     }
/* 49:52 */     return false;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public int hashCode()
/* 53:   */   {
/* 54:57 */     long l = Double.doubleToLongBits(this.b);
/* 55:58 */     return super.hashCode() ^ (int)(l ^ l >>> 32);
/* 56:   */   }
/* 57:   */   
/* 58:   */   public long c()
/* 59:   */   {
/* 60:63 */     return Math.floor(this.b);
/* 61:   */   }
/* 62:   */   
/* 63:   */   public int d()
/* 64:   */   {
/* 65:68 */     return uv.c(this.b);
/* 66:   */   }
/* 67:   */   
/* 68:   */   public short e()
/* 69:   */   {
/* 70:73 */     return (short)(uv.c(this.b) & 0xFFFF);
/* 71:   */   }
/* 72:   */   
/* 73:   */   public byte f()
/* 74:   */   {
/* 75:78 */     return (byte)(uv.c(this.b) & 0xFF);
/* 76:   */   }
/* 77:   */   
/* 78:   */   public double g()
/* 79:   */   {
/* 80:83 */     return this.b;
/* 81:   */   }
/* 82:   */   
/* 83:   */   public float h()
/* 84:   */   {
/* 85:88 */     return (float)this.b;
/* 86:   */   }
/* 87:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     fq
 * JD-Core Version:    0.7.0.1
 */